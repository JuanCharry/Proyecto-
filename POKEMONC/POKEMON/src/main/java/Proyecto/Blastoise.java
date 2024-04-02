package Proyecto;

import java.util.Arrays;


public class Blastoise extends  Pokemon{
    public Blastoise() {
        super("Blastoise", 180, Arrays.asList(
                new Ataque(" Torrente ", 5 ) ,
                new Ataque(" Caparazón Grueso " , 7 ) ,
                new Ataque(" Megacuerno " , 18 ) ,
                new Ataque(" Torbellino " ,12)
        ));
    }
}
