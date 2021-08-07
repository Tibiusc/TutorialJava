package AccessControl;

public class Fruct {

    // Public   = vizibil in orice clasa.
   //  Protected= ii vizibil in clasa curenta + in clasa care mosteneste.( Clasa copil )
   //  Private  = vizibil doar in clasa in care il declari.

   public String nume;
   public String culoare;
   public String forma;
   // OOP Incapsularea Datelor = conceptul pe baza caruia excludem unele date din mediul pe care il inconjoara.
   private String pret;

   public Fruct (String nume, String culoare, String forma, String pret){

      this.nume =nume;
      this.culoare=culoare;
      this.forma=forma;
      this.pret=pret;

   }

   public void printnumefruct(){
      System.out.println(nume);

   }

   protected void printculoare(){
      System.out.println(culoare);

   }

   private void printpret(){

      System.out.println(pret);
   }

   public void afiseazapret(){
      printpret();

      System.out.println("Exemple: public ");
   }



}
