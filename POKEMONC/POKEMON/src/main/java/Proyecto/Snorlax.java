package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Snorlax extends Pokemon {

    public Snorlax() {
        super(" Snorlax ", 85, Arrays.asList(
                new Ataque(" Sebo " , 5 ) ,
                new Ataque(" Inmunidad " , 8 ) ,
                new Ataque(" Espesura " , 5) ,
                new Ataque(" Regeneración " , 40 )
        ));
    }
}
