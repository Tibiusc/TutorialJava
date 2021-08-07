package exemple;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Multimi {     // Liste si arrays si Maps
    // DIferenta dintre un array si o lista;


    //

   @Test
    public void testeMultimi() {
       System.out.println("Folosim un array");
       afiseazaListaNumearray(5);
       System.out.println("Folosim o lista");
       afiseazaListanumeList();
       System.out.println("Folosim un HashMap");
       afiseazalistanumeMap();
    }

    public void afiseazaListaNumearray(int x ) {
       //Declaram un array
        String[] listanume = new String[x];
        listanume[0] = "Alexandru";
        listanume[1] = "alex";
        listanume[2] = "Alexander";
        listanume[3]=" gabriela";
        listanume[4]=" lavinia";
           // listanume.length == numarul maxim al multimii.
        for (int i = 0; i < listanume.length; i++) {
        System.out.println(listanume[i]);
        }


    }    // array e o multime finita. ;; // Dimensiunea unui arai .length;



    public void afiseazaListanumeList(){
       // Lista e un array mai updatat -

        List<String> listacunume= new ArrayList<>();     //List cheama o lista <tip> ; La lista nu trebuie sa pui un max;
                                                            // Lista nu are nevoie de un max
        listacunume.add("Samael");
        listacunume.add("Mitrutu");
        listacunume.add("Hahail");

        for(int i=0;i< listacunume.size();i++){
            System.out.println(listacunume.get(i));

            //dimensiunea unei liste o aflii cu size;
        }
   }       // array e o multime fara nr max;  // Dimensiunea unui array .size ;




    public void afiseazalistanumeMap(){
       //  la o anumita cheie am salva o anumita valaore;
        //Declaram un Map
        HashMap<String,List<String>> listatari = new HashMap<>();     // prima pozitie = cheia; a doua pozitie = valoarea;



        // Declaram o lista
        List<String> OraseRomania = new ArrayList<>();
         OraseRomania.add("Brasov");
         OraseRomania.add("Cluj Napoca");
        OraseRomania.add("Alba Iulia");

        // Declaram o lista
        List<String> OraseJaponia = new ArrayList<>();
        OraseJaponia.add("Hokkaido");
        OraseJaponia.add("tokyo");
        OraseJaponia.add("Nagasaki");


        // Adaugam Cheia si lista  in map ;
        listatari.put("Romania",OraseRomania);
        listatari.put("Japonia",OraseJaponia);



        System.out.println(listatari);


    }


}



