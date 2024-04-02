package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Gengar extends Pokemon{
    public Gengar() {
        super( " Gengar ", 20, Arrays.asList(
                new Ataque(" Levitación " ,10 ) ,
                new Ataque(" Cuerpo Maldito " , 5 ) ,
                new Ataque(" Habilidad Especial " ,7 ) ,
                new Ataque(" Insomnio " , 4)
        ));
    }
}
