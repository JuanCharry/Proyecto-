package Proyecto;

import java.util.Arrays;

public class Charizard  extends  Pokemon{

    public  Charizard (){
        super("Charizard" , 130 , Arrays.asList(
                new Ataque(" Mar Llamas " , 25  )  ,
                new Ataque(" Poder Solar " , 15  )  ,
                new Ataque(" Espíritu Vital " , 5 ) ,
                new Ataque(" Infiltración " , 10 )
        ));
    }
}
