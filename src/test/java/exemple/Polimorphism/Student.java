package exemple.Polimorphism;

public class Student {

    String nume;
    String prenume;
    int varsta;
    String adresa;


    // Polimorfismul : procesul prin care putem crea mai multe copii ale unei metode.
    //              doua tipuri de polimorfism:1. dinamic (overriding)= intr-o ierarhie de clase obtinute prin mostenire,
    //                                                                  o metoda poate avea implementari diferite
    //                                         2. static (overloading)= daca doua metode au acelasi nume,
    //                                                                  ele se diferentiaza dupa numarul de parametri sau tipul parametrilor/
    //                                                                  ceea ce returneaza metoda.
    //

    public Student(String nume,String prenume,int varsta,String adresa){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.adresa=adresa;
    }


    public void informatiistudent (){
        System.out.println("Studentul cu detaliile: "+nume+" ,"+prenume+" ,"+adresa+" ,"+varsta +" ani");


    }

}
