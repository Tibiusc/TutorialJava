package AbstractizareInterfete;

import org.junit.Test;

public class InterfataTest {

    @Test

    public void metodaTest(){

        PersoanaStudent Alexandru = new PersoanaStudent("Dorha", "Alex", 26, "Restantier");
        Alexandru.Invata();
        Alexandru.Detaliistudent();

        PersoanaAngajat Tibi = new PersoanaAngajat("Usc", "Tibi", 25, "Agent");
        Tibi.Munceste();
        Tibi.DetaliiAngajat();

        PersoanaAnjajatsiStudent Lore = new PersoanaAnjajatsiStudent("Budeanu","Loredana",25,"Vanzator");
        Lore.DetaliiAngajat();
        Lore.Detaliistudent();
    }
}
