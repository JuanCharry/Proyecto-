package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Dragonite  extends  Pokemon{

    public Dragonite() {
        super( "Dragonite", 80, Arrays.asList(
                new Ataque(" Multiescala " , 50),
                new Ataque(" Compiescolta " , 20),
                new Ataque(" Entusiasmo " , 12),
                new Ataque(" Cuerpo Puro " , 15)
        ));
    }
}
