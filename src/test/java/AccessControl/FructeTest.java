package AccessControl;

import org.junit.Test;

public class FructeTest {


    @Test
    public void fructtest(){

        System.out.println("Exemple: public ");
        Fruct obiect= new Fruct("piersica", "Rosie", "rotunda", "5 lei");
        Banana banana = new Banana("banana","galben","cilindrica", "3 lei");

        obiect.printnumefruct();
        banana.printnumefruct();

        obiect.printculoare();
        banana.printculoare();

        obiect.afiseazapret();
        banana.afiseazapret();


        System.out.println("Exemple: public ");




    }


}
