package exemple;

import java.util.List;

public class Telefon {

    // OOP - Object Oriented Programming
        /*  Constructori - DEf clasica = are ca rol sa initializeze variabilele unei clase.
        Constructorul iti construieste obiectul ;
        Contructor = Un constructor e tot timpul public  sia re numele clasei.
        Contructor = public + nume clasa +( poare sau nu sa aiba parametrii ) + {};
        Intr-o clasa exista un "constructor" fara parametrii ;
        Poti sa ai mai multi constructori intr-o clasa;
        Constructor == clasa nume;

                 */

    //value type vs reference type


    public String marca;
    public String model;
    public String culoare;
    public Boolean camera;


    // dupa ce faci clasa trebuie sa iti faci constructorul;
    // Constructor

    public Telefon(String marca, String model, String culoare, Boolean camera) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;
        this.camera = camera;
    }

    //constructor 2

    public Telefon(String marca, String model, String culoare) {
        this.marca = marca;
        this.model = model;
        this.culoare = culoare;


    }

    public void printmarca() {
        System.out.println("Marca telefonului este " + marca);
    }


    public void printmodel() {
        System.out.println("Modelul  telefonului este " + model);
    }


    public void printculoare() {
        System.out.println("Culoarea  telefonului este " + culoare);
    }


    public void areIncarcator() {

        if (marca.equals("Iphone")) {

            System.out.print("Nu primesti incarcator ... ");
            System.out.println("");
        } else {
            System.out.print("Are incarcator! ");
        }

    }

    public void arecamera() {    // boolena e true by default
        if (camera == null || camera.equals(false)) {
            System.out.println("Are camera.");

        } else {
            System.out.println("Nu are camera.");
        }
    }

        // metoda

        public void numartelefoanestoc(List<Telefon> listatelefoane){

        System.out.println(" Numarul telefoanelor din stoc este: "+ listatelefoane.size());


        }



}
