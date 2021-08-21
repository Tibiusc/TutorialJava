package exemple.Abstractclass;

import org.junit.Test;

public class AbstractclassTest {

    @Test
    public void Testamclasaabstracta() {
        PersoanaAngajat AngajatulMihai = new PersoanaAngajat("Mihai", "Arnold", 12, "Curier");
        PersoanaStudent StudentulTibi = new PersoanaStudent("Tibi", "Sfichi", 18, "vanzator");
        PersoanaStudentAngajat MihaiTibi = new PersoanaStudentAngajat("Mihai", "Tibi", 22, "receptioner");


        System.out.println("Angajat: ");
        AngajatulMihai.Munceste();
        AngajatulMihai.detaliiangajat();
        AngajatulMihai.Invata();

        System.out.println("Student: ");
        StudentulTibi.Invata();
        StudentulTibi.detaliiPersoana();

        System.out.println("Angajat si Student");
        MihaiTibi.Munceste();
        MihaiTibi.Invata();
    }


    }
