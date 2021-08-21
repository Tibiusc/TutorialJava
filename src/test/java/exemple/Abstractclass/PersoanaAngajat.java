package exemple.Abstractclass;

public class PersoanaAngajat extends Persoana {

    //definire
    private String nume;
    private String prenume;
    private int varsta;
    private String job;

    //constructor
    public PersoanaAngajat(String nume, String prenume, int varsta, String job) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.job = job;

    }
    // override polimorfism dinamic

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", job='" + job + '\'' +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    void Munceste() {
        System.out.println("Persoana angajat  cu numele : " + getNume() + " si prenumele " + getPrenume() + " munceste");


    }

    @Override
    void Invata() {

    }

    public void detaliiangajat() {
        detaliiPersoana();
        System.out.println(getNume() + " " + getPrenume());


    }
}
