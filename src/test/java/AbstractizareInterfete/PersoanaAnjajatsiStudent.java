package AbstractizareInterfete;

public class PersoanaAnjajatsiStudent extends Persoana implements Student,Angajat {
    public PersoanaAnjajatsiStudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul student cu " + getNume() + getPrenume() + " munceste.");

    }

    @Override
    public void DetaliiAngajat() {
        System.out.println(super.toString());

    }

    @Override
    public void Invata() {
        System.out.println("Studentul angajat cu " + getNume() + getPrenume() + " invata.");
    }

    @Override
    public void Detaliistudent() {
        System.out.println(super.toString());

    }
}
