package exemple;

import org.junit.Test;

public class Logicadestructuri {


    // Exista 2 tipuri de structuri : Structuri alternative si repetitive;
    // Structura alternativa - cea mai intalnita structura : Daca ... (conditie) ... atunci - executa ce scrie aici
    //                                                                             altfel - executa ce scrie aici
    // Structura repetitiva : Se executa o bucata de cod de 1...n ori
    // Repetitive : while/for
    //
    //

    @Test
    public void test() {

        verificanumere(9, 8);
        verificanumere(6, 9);
        verificanumere(6, 6);
        verificanumere(-3, 2);
        cautacuvant("Ana are multe mere si nu are pere", "mere");
        cautacuvant("Ana are multe mere si nu are pere", "bazooka");
        cautacuvinte("Ana are mere, pere si salam", "mere", "salam");
        cautacuvintetestlipsa("Ana are mere, pere si salam", "shaorma", "sabie");
        afiseazannumere(20);
        numaraminapoidelan(20);
        afisarenumerecuwhile(20);
        sumaprimelor5numere();
        sumaprimelor5numerecuoprire();
        Numerelepare();
        Sumanumerelorimpare();
    }

    // Verificam daca nr 5 e mai mare ca nr 3  5>3
    // VErificam daca primul nr e mai mare ca al doile
    public void verificanumere(int a, int b) {

        System.out.println("comparatie intre " + a + " si " + b + " :");
        if (a > b) {
            System.out.println(a + ">" + b + "  este correct");
        } else {
            System.out.println(a + ">" + b + "  este incorrect!!");
        }
        ;
    }


    // Verificam daca o propozitie contine un anumit cuvant;

    public void cautacuvant(String propozitie, String cuvant) {

        System.out.println("Verifica daca " + "'" + cuvant + "'" + " apare in propozitia  " + propozitie);
        if (propozitie.contains(cuvant)) {
            System.out.println(cuvant + " apare in propozitie");
        } else {
            System.out.println(cuvant + " nu apare in propozitie");
        }
    }

    //  Verifica daca o propozitie contine mai multe cuvinte
    // && si

    public void cautacuvinte(String propozitia1, String cuvant1, String cuvant2) {
        System.out.println("Verificam daca \"" + cuvant1 + "' si '" + cuvant2 + "' Sunt in propozitia: " + propozitia1);

        if (propozitia1.contains(cuvant1) && propozitia1.contains(cuvant2)) {                      // Amandouda trebuie sa apara sa mergem pe if
            System.out.println(cuvant1 + " si '" + cuvant2 + "' apar in propozitie");
        } else {
            System.out.println(cuvant1 + " si " + cuvant2 + " nu apar in propozitie");
        }
    }


    //Verifica daca contine numai unu  din doua cuvinte   "sau = || "
    public void cautacuvintetestlipsa(String propozitiaunu, String cuvant1, String cuvant2) {
        System.out.println("Verificam daca '" + cuvant1 + "' si '" + cuvant2 + "' Sunt in propozitia: " + propozitiaunu);

        if (propozitiaunu.contains(cuvant1) || propozitiaunu.contains(cuvant2)) {                    // Daca oricare dintre cuvine apare mergem pe "IF"
            System.out.println("propozitia contine un cuvant din cele doua .");
        } else {
            System.out.println("Propozitia nu contine nici un cuvant");
        }

    }
    // Structurile alterntative fac referire la o situatie concreta

    // Structuri repetitive

    // Printeaza primele cate numere vrei tu


    public void afiseazannumere(int n) {
        System.out.println("Afiseaza n numere");

        // Structura for = 3 conditii : 1. de la ce numar incep. 2.Conditia "pana cand sa parcurg. 3.Conditia sa treaca la elementul urmator

System.out.println("Numar de la 0 la "+n);
        for (int index = 0; index < n+1; index++) {   //  index < n+1 same as index <=n  // index++ = index +1
            System.out.print(index +", ");

        }
        System.out.println(" ");
    }


        // Afisam numerele de la n la 0

    public void numaraminapoidelan ( int n){
        System.out.println(" Numaram inapoi de la"+n + " cu for");

        for (int index=n; index>-1; index-- ) {
        System.out.print(index+", ");
        }
System.out.println(" ");
    }



        // Afisam numerele de la 0 la 100 cu while

    public void afisarenumerecuwhile (int n) {
System.out.println("numaram cu functia while");
        // De unde vrei sa pornesti
        int index = 0;
        //
        while (index < n + 1) {
            System.out.print(index +", ");
            index++;
        }
    }

    // Calculeaza suma primelor 5 numere de la 1 la 20

    public void sumaprimelor5numere(){
        System.out.println("") ;
        System.out.println("Suma primelor 5 numere este");

        int suma=0;
        for (int index=0; index<20+1;index++){
            if(index<5+1){ suma=suma+index;
            } else {index=21;}
        }
        System.out.println(suma);

    }

    // Afisam primele 5 numere din intervalull 1-20



    public void sumaprimelor5numerecuoprire(){
        System.out.println("") ;
        System.out.println("Suma primelor 5 numere este");

        int suma=0;
        for (int index=0; index<20+1;index++){
            if(index<5+1){ suma=suma+index;

             }  else {break;


                }                                 // BREAK opreste o structura repetitiva
        }
        System.out.println(suma);


    }
        // Afisam numerele pare de la 1 la 50                                   Semnul de % se uita dupa rest;
                                                                                // Catul se calculeaza cu / ;
    public void Numerelepare(){

        for(int index=0; index<51; index++){

            if(index%2==0){System.out.print(index+" ");}
                        // un egal "=" - atribuirea unei valori
        }                                                                          // doua egaluri "==" -egalul pe care il intelegem noi

    }


        // Afiseaza suma numerelor impare

    public void Sumanumerelorimpare (){
        int sumanrimpare=0;
        for (int index=0; index<51;index++){

            if (index%2==1){                                        // != diferit  ;
                sumanrimpare=sumanrimpare+index;

            }


        }
        System.out.println("");
        System.out.println("Suma numerelor imapre este: " + sumanrimpare);
    }
}


