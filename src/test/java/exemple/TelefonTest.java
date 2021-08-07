package exemple;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TelefonTest {
     // Obiect = Def. Instanta unei clase ;
    // Un obiect = numele clasei + nume obiect = new numeclasa ( se apeleaza constructorul ) + valori pt parametrii
    // Poti sa ai mai multe obiecte. trebuie sa aiba un nume unic.



    @Test
    public void telefontest(){

        Telefon Samsung = new Telefon("Samsung","S4","NEgru", true);
        Telefon Iphone = new Telefon("Iphone", "11", "Gri",true);
        Telefon Nokia = new Telefon("Nokia", "Caramida", "gri");
        Telefon Allview = new Telefon("viewall", "Xqc", "ticlam",true);
        Telefon brick = new Telefon("brick", "wall", "caramiziu",true);
        Telefon Asus = new Telefon(";everagel", "tcb", "frumoasa",true);
        System.out.println("==========================================================");
        //declaram o lista

        List<Telefon> telefoane = new ArrayList<>();
        telefoane.add(Samsung);
        telefoane.add(Iphone);
        telefoane.add(Nokia);
        telefoane.add(Allview);
        telefoane.add(brick);
        telefoane.add(Asus);

        Asus.numartelefoanestoc(telefoane);


        System.out.println("==========================================================");
        Samsung.printmarca();
        Iphone.printmarca();
        Iphone.printculoare();
        Iphone.printmarca();
        Samsung.areIncarcator();
        System.out.println();
        Iphone.areIncarcator();
        Nokia.areIncarcator();
        System.out.println();
        Iphone.arecamera();
        Nokia.arecamera();

// Schimbam o valoare din obiect
        System.out.println("-----------------------------------------------");
        Samsung.printmodel();
        Samsung.model="S20 ";
        Samsung.printmodel();
        System.out.println("-----------------------------------------------");
        Nokia.arecamera();
        Nokia.camera=true;
        Nokia.arecamera();

    }
}
