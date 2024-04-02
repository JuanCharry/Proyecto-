package Proyecto;

import java.util.Arrays;
import java.util.List;

public class Eevee extends Pokemon{
    public Eevee() {
        super( "Eevee", 100, Arrays.asList(
                new Ataque(" Adaptabilidad " , 29 ) ,
                new Ataque(" Anticipación " , 18 ) ,
                new Ataque(" Entusiasmo " , 12 ) ,
                new Ataque(" Frente Frío " ,10 )
        ));
    }
}
