package Proyecto;

import java.util.Random;
import java.util.List;
public class BatallaPokemon {
    private Equipo equipo1 ;
    private Equipo equipo2 ;
    private Random random ;

    public BatallaPokemon(Equipo equipo1 , Equipo equipo2) {
        this.equipo1 = equipo1 ;
        this.equipo2 = equipo2 ;
        random = new Random();
    }

    public void simularBatalla() {
        Equipo atacante, defensor;
        while (!equipo1.getPokemones().isEmpty() && !equipo2.getPokemones().isEmpty()) {
            // Determinar qué equipo ataca y cuál defiende en este turno
            atacante = random.nextBoolean() ? equipo1 : equipo2;
            defensor = (atacante == equipo1) ? equipo2 : equipo1;

            // Elegir un Pokémon y un ataque para el equipo atacante
            Pokemon pokemonAtacante = elegirPokemon(atacante);
            IAttack ataque = elegirAtaque(pokemonAtacante);

            // Efectuar el ataque
            ejecutarAtaque(pokemonAtacante, ataque, defensor);

            // Intercambiar el turno
            Equipo temp = atacante;
            atacante = defensor;
            defensor = temp;
        }

        // Mostrar el equipo ganador
        Equipo equipoGanador = equipo1.getPokemones().isEmpty() ? equipo2 : equipo1;
        System.out.println("El equipo ganador es: ");
        for (Pokemon pokemon : equipoGanador.getPokemones()) {
            System.out.println(pokemon.getName());
        }
    }

    private Pokemon elegirPokemon(Equipo equipo) {
        List<Pokemon> pokemones = equipo.getPokemones();
        int index = random.nextInt(pokemones.size());
        return pokemones.get(index);
    }

    private IAttack elegirAtaque(Pokemon pokemon) {
        List<IAttack> ataques = pokemon.getAttacks();
        int index = random.nextInt(ataques.size());
        return ataques.get(index);
    }

    private void ejecutarAtaque(Pokemon atacante, IAttack ataque, Equipo defensor) {
        // Obtener un Pokémon al azar del equipo defensor
        List<Pokemon> pokemonesDefensor = defensor.getPokemones();
        Pokemon pokemonDefensor = pokemonesDefensor.get(random.nextInt(pokemonesDefensor.size()));

        // Realizar el ataque con el daño predefinido del ataque
        int damage = ataque.getDamage();
        pokemonDefensor.setHealth(pokemonDefensor.getHealth() - damage);

        // Mostrar el resultado del ataque
        System.out.println(atacante.getName() + " usó " + ataque.getName() + " y causó " + damage + " de daño a " + pokemonDefensor.getName());
        if (pokemonDefensor.getHealth() <= 0) {
            System.out.println(pokemonDefensor.getName() + " ha sido derrotado!");
            defensor.eliminarPokemon(pokemonDefensor);
        }
    }
}
