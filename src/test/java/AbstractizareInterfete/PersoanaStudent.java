package AbstractizareInterfete;

public class PersoanaStudent extends Persoana implements Student {

    //Mostenire = extends; (O clasa se mosteneste)
    //Interfata = implements; (O interfata se implementeaza)
    // O clasa poate implementa o multime de interfete;
    //Cand o clasa implementeaza o clasa => clasa trebuie sa ofere implementari pnetru toate metodele interfetei;



    public PersoanaStudent(String nume, String prenume, int varsta, String job) {
        super(nume, prenume, varsta, job);
    }

    @Override
    public void Invata() {
        System.out.println("Studentul  " + getNume() + getPrenume() + " invata.");
    }

    @Override
    public void Detaliistudent() {
        System.out.println(super.toString());

    }
}
