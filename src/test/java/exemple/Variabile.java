package exemple;

import org.junit.Test;

public class Variabile {
    // Clasa = o colectie de variabile si metode
    // Structura = access control(public) + class + nume clasa + acolade
    // intr-un fisier java poti sa ai mai multe clase!
    // fiecare clasa trebuie sa aiba un nume diferit
    // Daca vrem sa avem mai multe clase intr-un fisier  = 1 clasa publica si restul nu.

    // O variabila = atributul unei clase
    //  Tipuri variabile = 2 tipuri ( globale si locale )
    //  Structura globala = access control (public) + tip variabila + nume + ";"
    // Structura locala = tip variabila + nume
    // O variabila poate sau nu sa primeasca o valoare


     public int numar;
     public char litera;
     public String nume;
     public double numarVirgula;

     // o metoda = o "actiune" pe care o poate face o clasa cu sau fara variabile;
     // Metodele sunt de 2 tipuri =1. Metode "void"(metode care ne arata ceva)
     //                            2. Metode "return"( metode care ne returneaza ceva)
     // structura metoda void = access control(public) + void(tip metoda) + nume +"()" + "{}"
     // Metodele pot sau nu sa contina parametri
     // Parametri fac referire la valori care vin din afara metodei.
     // Facem o metoda de test
     // Ca sa fie o metoda de test = ma folosesc de JUnit
     // JUnit = "@Test" deasupra metodei
     @Test
     public void Metodatest(){
         // apelez metoda care imi afiseaza numele pe tastatura
          Afisarenume();
          Afiseazazisidata();
          Initializazavariabile();
          Afisareunnumegeneral("Eugen");
          Afisareunnumegeneral("Cristi");
          Calculsuma(4,6,8);
          Calculsuma(3,7,9);
          System.out.println(getSalariu());
          System.out.println(getMesaj());

     }

     // Metoda care imi afiseaz numele pe tastatura
     public void Afisarenume() {
            nume="Alexandru";
            System.out.println("Cerinta 1:");
            System.out.println(nume);
     }
     // Metoda care afiseaza un nume pe tastatura
     // Parametri se scriu intre '()'
     // Parametri se delimiteaza cu virgula ','
     // Parametri au structura ca o variabila locala

    public void Afisareunnumegeneral(String Numegeneral){
        nume=Numegeneral;
        System.out.println("Cerinta 4:");
        System.out.println(nume);
    }

     //Metoda care afiseaza data si ziua de astazi
     //
     public void Afiseazazisidata(){
            String data="10 Iulie 2021";
            String ziua="Sambata";
            System.out.println("Cerinta 2:");
            System.out.print(data+" ");
            System.out.println(ziua);

     }

     // Metoda care initializaza restul variabilelor
    public void Initializazavariabile (){
           numarVirgula=2.5;
           numar=20;
           litera='A';
           System.out.println("Cerinta 3:");
           System.out.println(numarVirgula);
           System.out.println(numar);
           System.out.println(litera);


    }
    // Metoda care calculeaza suma a 3 numere intregi

    public void Calculsuma(int nr1, int nr2, int nr3){
         System.out.println("Cerinta 5");
         int suma=nr1 + nr2 +nr3;
         System.out.println("Suma celor 3 numere este: " + suma);
    }

    // O metoda care returneaza salariul unui angajat
    // Structura metoda "return" = access control(public) + tip de valoare de returnat + nume +"()" + "{}"


    public double getSalariu(){
         System.out.println("Cerinta 6:");
         double Salariu=99.99;

         return Salariu;

    }

    // Metoda care returneaza un mesaj
    public String getMesaj(){
        System.out.println("Cerinta 7:");
        String mesaj="Felicitari! Esti patron! $$";
        return mesaj;


    }






}

