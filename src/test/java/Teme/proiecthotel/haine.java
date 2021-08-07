package Teme.proiecthotel;

public class haine {

    private String tip;
    public String culoare;
    public int greutate;


    public haine(String tip, String culoare, int greutate){
        this.tip=tip;
        this.culoare=culoare;
        this.greutate=greutate;

    }


    public String gettipuldehaine(){

        System.out.println("Acest obiect este " + tip);
        return tip;
    }



    public String getCuloare(){

        System.out.println("Acest obiect are culoarea " + culoare);
        return culoare;
    }
//    public String getTip(){System.out.println(tip+" ");return tip;}
//    public String getCuloare(){System.out.println(" culoarea este "+ culoare);return culoare;}
//    public int getGreutate(){System.out.println("greutatea: "+ greutate);return greutate;}




}
