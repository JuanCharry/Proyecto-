package Proyecto;

import java.util.Arrays;

public class Mewtwo extends  Pokemon{
    public Mewtwo(){
        super(" Mewtwo " , 170 , Arrays.asList(
                new Ataque(" Presión ", 10),
                new Ataque(" Firmeza ", 7 ),
                new Ataque(" Insomnio ", 6),
                new Ataque(" Descarga Cerebral ", 4)
        ));
    }

}
