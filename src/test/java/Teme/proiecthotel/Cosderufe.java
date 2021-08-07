package Teme.proiecthotel;

import java.util.ArrayList;
import java.util.List;
   // clasa cos de rufe  creeaza un obiect unde pot tine rufele;


public class Cosderufe {


    // numele cosului
    String cosulnumarul;


    // constructor
    public Cosderufe(String cosulnumarul) {
        this.cosulnumarul = cosulnumarul;

    }

    // Am creat o lista care accepta obiecte tip haine pentru a le depozita
    public List<haine> listacuhaineledincos = new ArrayList<>();
    static int numarulcosului = 0;


    // adaugam haine in cos
    public void addCos(haine ob) {

        listacuhaineledincos.add(ob);


    }

    // verificam cosul
    public void cosContents() {

        for (int i = 0; i < listacuhaineledincos.size(); i++) {
            listacuhaineledincos.get(i).gettipuldehaine();
        }


    }

    // verificam un obiect din cos

    public void cautaobiect(int numarulobiectului) {

        listacuhaineledincos.get(numarulobiectului).gettipuldehaine();
        ;


    }


    public void numarobiecte() {


        int nr = listacuhaineledincos.size();
        System.out.println(nr);


    }


    public void verificahaineleifalbe() {
        System.out.println("Sunta hainele albe?");
        for (int i = 0; i < listacuhaineledincos.size(); ) {
            //verifica daca sunt albe

            if (listacuhaineledincos.get(i).culoare.contentEquals("alb")) {

                if (i < listacuhaineledincos.size()) {
                    i++;
                    if (i == (listacuhaineledincos.size())) {
                        System.out.println("Toate hainele sunt albe");
                        break;
                    }
                }
            }else{System.out.println("eroare");break;}
        }
    }
    //verifica daca sunt negre
    public void verificahaineleifnegre() {
System.out.println("Sunta hainele negre?");
        for (int i = 0; i < listacuhaineledincos.size(); ) {


            if (listacuhaineledincos.get(i).culoare.contentEquals("negru")) {

                if (i < listacuhaineledincos.size()) {
                    i++;
                    if (i == (listacuhaineledincos.size())) {
                        System.out.println("Toate hainele sunt negre");
                        break;
                    }
                }
            }else{System.out.println("eroare");break;}
        }
    }


    public void verificahaineleifcolorate() {
        System.out.println("Sunta hainele colorate?");
        for (int i = 0; i < listacuhaineledincos.size(); ) {


            if (listacuhaineledincos.get(i).culoare.contentEquals("colorat")) {

                if (i < listacuhaineledincos.size()) {
                    i++;
                    if (i == (listacuhaineledincos.size())) {
                        System.out.println("Toate hainele sunt colorate");
                        break;
                    }
                }
            }else{System.out.println("eroare");break;}
        }
    }


    haine tricouverde= new haine("tricou","colorat", 50);
    haine tricoualb= new haine("tricou","alb", 50);
    haine tricourosu= new haine("tricou","colorat", 50);
    haine tricounegru= new haine("tricou","negru", 50);
    haine pantalonialbastri = new haine("pantaloni", "colorat", 100);
    haine pantaloninegri = new haine("pantaloni", "negru", 100);
    haine pantalonialbi = new haine("pantaloni", "alb", 100);






//          Cosul 1 - test case 1    -3 ob

    public Cosderufe getCos1(int i) {
        System.out.println("Acesta este cosul 1");
        Cosderufe Cos1 = new Cosderufe("Cosul numarul 1");
        Cos1.addCos(tricoualb);
        Cos1.addCos(tricounegru);
        Cos1.addCos(pantalonialbastri);
        Cos1.cosContents();


        if (i==1){ Cos1.verificahaineleifnegre(); }
        if (i==2){ Cos1.verificahaineleifalbe(); }
        if (i==3){ Cos1.verificahaineleifcolorate();}

        return Cos1;
    }
////
//


    public Cosderufe getCos2(int i)

    {
//        // Cosul 2 - test case 2   fara colorate  -4 ob
        Cosderufe Cos2= new Cosderufe("Cosul numarul 2");

        System.out.println("Acesta este cosul 2");
        Cos2.addCos(tricoualb);
        Cos2.addCos(tricounegru);
        Cos2.addCos(pantalonialbi);
        Cos2.addCos(pantaloninegri);
        Cos2.cosContents();
        if (i==1){ Cos2.verificahaineleifnegre(); }
        if (i==2){ Cos2.verificahaineleifalbe(); }
        if (i==3){ Cos2.verificahaineleifcolorate();}
        return Cos2;
    }
    //
//
    public Cosderufe getCos3(int i) {
//        // Cosul 3 - test case 3   - fara negre - 3 ob
        Cosderufe Cos3 = new Cosderufe("Cosul numarul 3");
        System.out.println("Acesta este cosul 3");
        Cos3.addCos(tricoualb);
        Cos3.addCos(tricourosu);
        Cos3.addCos(pantalonialbi);
        Cos3.cosContents();
        if (i==1){ Cos3.verificahaineleifnegre(); }
        if (i==2){ Cos3.verificahaineleifalbe(); }
        if (i==3){ Cos3.verificahaineleifcolorate();}
        return Cos3;
    }

    public Cosderufe getCos4() {
//        // COsul 4 -test case 4    4 ob - fara albe
        Cosderufe Cos4 = new Cosderufe("Cosul numarul 4");
        System.out.println("Acesta este cosul 4");

        Cos4.addCos(tricourosu);
        Cos4.addCos(tricounegru);
        Cos4.addCos(pantalonialbastri);
        Cos4.addCos(pantaloninegri);
        Cos4.cosContents();
        return Cos4;
    }

    public Cosderufe getCos5(int i) {
        //Cosul 5 -test case 5   4 ob -  toate negre
        Cosderufe Cos5 = new Cosderufe("Cosul numarul 5");
        System.out.println("Acesta este cosul 5");
        Cos5.addCos(pantaloninegri);
        Cos5.addCos(tricounegru);
        Cos5.addCos(pantaloninegri);
        Cos5.addCos(tricounegru);
        Cos5.cosContents();
//        Cos5.numar123(1,Cos5);
        return Cos5;

    }
//

    public Cosderufe getCos6() {
        // Cosul 6 - test case 6  2 ob - toate colorate
        Cosderufe Cos6 = new Cosderufe("Cosul numarul 6");
        System.out.println("Acesta este cosul 6");
        Cos6.addCos(tricourosu);
        Cos6.addCos(pantalonialbastri);
        Cos6.cosContents();
        return Cos6;
    }


    public Cosderufe getCos7() {
//        //Cosul 7 - test case 7   4 ob - toate albe
        Cosderufe Cos7 = new Cosderufe("Cosul numarul 7");
        System.out.println("Acesta este cosul 7");
        Cos7.addCos(tricoualb);
        Cos7.addCos(tricoualb);
        Cos7.addCos(pantalonialbi);
        Cos7.cosContents();

        return Cos7;
    }




//    public void numar123 (int i, Cosderufe Cosnr){
//
//        if ( i==1){ Cosderufe.verificahaineleifnegre(); }
//        if ( i==2){ Cosderufe.verificahaineleifalbe(); }
//        if ( i==3){ Cosderufe.verificahaineleifcolorate();}
//
//
//    }


}

