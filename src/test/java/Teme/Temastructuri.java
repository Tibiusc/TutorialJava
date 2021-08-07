package Teme;
        //-DONE!- Citim 3 nunere cu valori diferite. Daca suma primelor 2 nr e mai mare decat al 3 -lea numar afisam un mesaj corespunzator +valoarea sumei,
//altfel afisam contrariul.
        // -DONE! Afiseaza de 5 ori cuvantul da pe acelasi rand cu spatiu intre. Rezolva problema in 2 moduri diferite.
        // -DONE! Primele 5 numere divizibile cu 3
        // -DONE! Primele 3 numere divizibile cu 5
        // -DONE! Primele 4 numere pozitive si pare
        // -DONE! Produsul numerelor pana la 5
        //REscriem problemele de mai sus in functie de abordarea noastra


import org.junit.Test;

public class Temastructuri {


    @Test
    public void temastructuritest(){

        sumaadouadin3(3,4,30);
        sumaadouadin3(10,5,8);
        afiseazaDeXori(5);
        afiseazaDeYori(5);
        primelexNumeredivizivilecu3(20,5);
        primelexNumeredivizivilecu3(100, 0 );
        primelexNumeredivizivilecu3(3,1);
        primelexNumereDivCu5(30,5);
        primelexNumereDivCu5(5,10);
        System.out.println("Cerinta 5: Primele x numere pare si pozitive dintr-un inteval:  ");
        xnumerepozitivesipare(5,-10,20);
        System.out.println();
        System.out.println("Cerinta 6: Produsul numerelor pana la z  ");
        produsulNumerelorpanala5(5);
        afisamDexoricuWhile(5);
        primeleXNumereDivizibilecu3folosindWhile(50);
        prielexNumereDivizibilecu5FolosinfWhile(25);

        ////// Rescriem /////
    }



    //cerinta 1: 3 numere cu;

    public void sumaadouadin3 (int a, int b, int c){

                    System.out.println("cerinta 1:3 numere "+a+" "+b+" "+c+" ");
                    if(a+b>c){ System.out.println(a+b+">"+c+"  Suma primelor 2 numere este mai mare decat al 3lea");}
                    else{System.out.println(a+b+"<"+c+" Suma primelor 2 numere este mai mica decat al 3lea");}



    }

        public void afiseazaDeXori (int x){
                    System.out.println("Cerinta 2: Afisam de 5 ori cu structura \"for\"");
                    int b=0;
                    for(int i=1; i<x+1;i++){

                        b++;
                        System.out.print(b+"."+"DA ");

                    }

                         System.out.println();
        }


        public void afiseazaDeYori(int y){
                    System.out.println("Cerinta 2b: Afisam de 5 ori cu structura \"while\":");
                    int i=1;
                    while (i<y+1){
                        System.out.print(i+" Da ");
                        i++;
                    }
                    System.out.println();
        }

        public void primelexNumeredivizivilecu3(int numar,int x){
                    System.out.println("Primele "+x+" numere divizibile cu 3"+ " din "+numar+" numere" );


                            int count=0;        //numarul de numere impare



                            for (int i = 1 ; i < numar + 1; i++)  {    // structura trece prin toate numerepele pana la numar+1



                                if (x>numar) {System.out.println("Ai cerut mai multe numere decat posibil");break;}


                                    if (i % 3 == 0) {                  // verifica fiecare numar sa vada daca e div cu 3 si printeaza numarul

                                        System.out.print(i + " ");
                                        count++;                       // de fiecare data cand printeaza numarul creste numarul de numere.

                                    }


                                if( count==x){

                                    break;}                 // cand numarul de numere ajunge la x se opreste bucla for



                            }
                               //System.out.println();
                               System.out.println(" Am gasit "+ count+ " numere!");





        }



        public void primelexNumereDivCu5(int numere, int x){ System.out.println();
                        System.out.println("Cerinta 4: ");
                        System.out.println("Primele "+x+" numere divizible cu 5 pana la "+ numere);
                        int count=0;

                        for(int i=0; i<numere+1;i++){
                            if(x>numere){ System.out.println("Ai cerut prea multe numere!!" );break;}
                            if(i%5==0){
                                System.out.print(i+" ");
                                count++;

                            }


                            if (count==x){break;}
                        }




        }



        // Primele x numere pozitive si pare din y numere cerinta 5

        public void xnumerepozitivesipare(int x ,int interval1 , int interval2){

                        int i;
                        int count=1;
                    for(i=interval1;i<interval2+1;i++ ){

                        if(i%2==0 && i>0) {
                            System.out.print(i + " ");
                        }

                                if(i>0 && i%2==0){count++;}

                            if(count==x+1) { break;}

                    }


        }

        public  void produsulNumerelorpanala5(int z){

                        int x=1;

                        int i=1;

                        while ( i<z){

                            i++;
                            x=x*i;
                        }
                            System.out.print(x);

        }


        ////////RESCRIEM - cerinta 7 //////////////////

        public void afisamDexoricuWhile (int x){
            System.out.println();
                System.out.println("Cerinta 7.1: ");

                int i=0;
                while(i<x){
                    System.out.print(" DA");
                    i++;

                }

                System.out.println();

        }

        public void primeleXNumereDivizibilecu3folosindWhile (int x){
            System.out.println("Cerinta 7.1: Primele numere divizibile cu 3 pana la "+x+" folosind \"while\"");
        int i=1;
                while(i<x){

                if(i%3==0){System.out.print(i+" ");}
                i++;


                }



        }

        public void prielexNumereDivizibilecu5FolosinfWhile(int x){
            System.out.println();
                System.out.println("Cerinta 7.2: primele numere divizibile cu 5 pana la "+x+" folosind \"while\"");

                int i=1;

                while(i<x+1){

                    if(i%5==0){System.out.print(i+" ");}
                    i++;


                }




        }

}





