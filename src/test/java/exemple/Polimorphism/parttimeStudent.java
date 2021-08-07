package exemple.Polimorphism;

public class parttimeStudent extends Student{

    public parttimeStudent(String nume, String prenume, int varsta, String adresa) {
        super(nume, prenume, varsta, adresa);
    }

    // aplicam polimorfismul dinamic
    //

    public void informatiistudent(){


      super.informatiistudent();
      System.out.println("Studentul este part time");


    }

    // Aplicam polimorfismmul static

    //

    public void calculmedie(double nota1, double nota2){

        double suma=nota1+nota2;
        System.out.println("Media este: "+ suma/2);
    }

    public void calculmedie(double nota1, double nota2, double nota3){
        double suma=nota1+nota2+nota3;
        System.out.println("Media este: "+ suma/3);
    }



}
