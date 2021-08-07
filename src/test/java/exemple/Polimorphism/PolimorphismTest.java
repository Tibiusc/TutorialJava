package exemple.Polimorphism;

import org.junit.Test;

public class PolimorphismTest {

    @Test
    public void testam(){

        parttimeStudent studentparttime = new parttimeStudent("Mihai", "mihaita",23,"Strada plopilor");
        studentparttime.informatiistudent();
        fulltimeStudent studentfulltime = new fulltimeStudent("Andrei","salo",26,"Allea palin");
        studentfulltime.informatiistudent();

        studentparttime.calculmedie(7.4,7.8);

        parttimeStudent studentParttime = new parttimeStudent("Mihai", "mihaita",23,"Strada plopilor");
        studentParttime.calculmedie(6.5,8.8,9.5);
       

    }
}
