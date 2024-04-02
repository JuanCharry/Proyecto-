package Proyecto;

import java.util.Arrays;


public class Lucario extends  Pokemon{
    public Lucario() {
        super("Lucario", 80, Arrays.asList(
                new Ataque(" Vista Lince " ,15  ) ,
                new Ataque(" Audaz " , 20 ) ,
                new Ataque(" Puño Férreo "  ,35  ) ,
                new Ataque(" Justiciero " , 10  )
        ));
    }
}
