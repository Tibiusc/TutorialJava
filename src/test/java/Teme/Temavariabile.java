package Teme;

import org.junit.Test;

public class Temavariabile {


        /* Variables
        Exercises : Clasa Noua creata afiseaza pe ecran urmatoarele:
            Pentru fiecare linie se declara variabile noi

            done! -Hello World
            done! -Varsta ta (no)
            done!-Numele si prenumele pe 2 randuri
            done!-Care ii data de astazi ? tot Data , ora, zi ;
            done! - Cat face [2+(3*4)-3]/3 ? Afiseaza: Rezultatul corect este: "rezultat "
            done! -afiseaza pe ecran suma a 3 numere double  intr-o variabila de acelasi tip  + mesaj
            done! -  Adauga la "salut" caracterul "M" la final
            done! - Adauga la "hello" caracterul " H" la inceput
            done! -Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"

            ???-Comenteaza cerinta 2 4 6

            ???-Decomenteaza cerintele comentate


            done!-Adauga la toate rezultatele obtinute
            Poti pleca acasa dua ce iti verifice munca




         */


    @Test
    public void testtema(){

        Helloworld("Hello World");   // Hello e o variabila si un parametru care poate lua un String. Diferit de Hardcoding
        varstamea(25);               // Varsta e parametrul aceste metode. IN metoda , Varsta se atribuie variabile x si sistemul printeaza x ;
        Numelesiprenumele("Jina", "Alexandru");
        Dataorazi(07.12, 2021,16,33,"Luni");
        getCalcul(2,3,4);   // (a+(b*C)-b)/b
        getsuma3numeredouble(3.5, 2.5,2.5);
        salutcuM("Hello", 'M');    // printeaza hello cu 'M" la sfarsit
        Hhelo('H', "Hello");
        anaare("Ana", "mere","pere","prune", 'Z');
    }




    public void Helloworld(String Hello){


        System.out.print(Hello);  System.out.println(">>>>  Poti pleca acasa dupa ce iti verifici munca!");



    }


    public void varstamea(int varsta){


        System.out.print("Varsta mea este : " + varsta + " ani."); System.out.println(" >>>>  Poti pleca acasa dupa ce iti verifici munca!");

    }

    public void Numelesiprenumele(String numele, String prenumele){

        System.out.print("Numele meu este: " + numele); System.out.println(" >>>>  Poti pleca acasa dupa ce iti verifici munca!");
        System.out.print("Prenumele meu este: " + prenumele); System.out.println(" >>>> Poti pleca acasa dupa ce iti verifici munca!");


    }

    public void Dataorazi(double data, int an, int ora1, int minute, String zi ){

        System.out.print("Data de astazi :" + data + " ");        // Nu am reusit sa printez data si anul pe aceeasi linie. Am incercat cu "," si cu "+'
        System.out.print(an); System.out.println("  >>>> Poti pleca acasa dupa ce iti verifici munca!");
        System.out.print("Ziua & Ora: "+  zi+ " " +ora1 +":" +minute  );System.out.println(" >>>>  Poti pleca acasa dupa ce iti verifici munca!");


    }

    public double getCalcul(double a, double b, double c){

        double rezultat= (a+(b*c)-b)/b;       // Nu poti obtine un rezultat de tip double in urma unui calcul cu variabile int
        System.out.print("Rezultatul calculului ["+a+"X("+b+"X"+c+")-"+b+"]/"+b+" este: " + rezultat);
        System.out.println("  >>>> Poti pleca acasa dupa ce iti verifici munca!");
        return rezultat;
    }


    public double getsuma3numeredouble (double nr1, double nr2, double nr3){

        double suma3numeredouble= nr1 + nr2+nr3;

        System.out.print("Rezultatul adunarii numerelor double este: " + suma3numeredouble);
        System.out.println(" >>>> Poti pleca acasa dupa ce iti verifici munca!");
        return suma3numeredouble;


    }


    public void salutcuM (String x, char y) {

        System.out.print("Un M la sfarsit de Hello = " +x + y);
        System.out.println(" >>>> Poti pleca acasa dupa ce iti verifici munca!");

    }


    public void  Hhelo (char x, String hello ){
        System.out.print("Doi de H pentru hello = "+x+hello);
        System.out.println(" >>>> Poti pleca acasa dupa ce iti verifici munca!");

    }
 public void anaare (String Nume, String fruct1, String fruct2, String fruct3 ,char z) {
     //-Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la final caracterul "Z"
        System.out.print(Nume+z+" are"+z+" "+fruct1+z+","+fruct2+z+","+fruct3+z+".");
     System.out.println("  >>>> Poti pleca acasa dupa ce iti verifici munca!");

 }

}
