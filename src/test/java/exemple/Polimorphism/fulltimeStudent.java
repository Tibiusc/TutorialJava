package exemple.Polimorphism;

public class fulltimeStudent extends Student{


    public fulltimeStudent(String nume, String prenume, int varsta, String adresa) {
        super(nume, prenume, varsta, adresa);
    }


    public void informatiistudent(){


        super.informatiistudent();
        System.out.println("Studentul este full-time");


    }
}
