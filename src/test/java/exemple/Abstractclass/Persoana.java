package exemple.Abstractclass;

public abstract class Persoana {

    //Clasa abstracta = are ca rol sa defineasca comportamentul unei clase
    //Se foloseste cuvantul "abstract" ca sa specificam ca este o clasa abstracta
    //O clasa abstracta poate sa sau nu sa continta metode abstracte;
    //O clasa abstracta se extinde/mosteneste nu se implementeaza;
    //O clasa abstracta poate implementa o interfata;
    //Interfata poate implpeta doar o alta interfata
    //Metodele trebuie sa continta abstract in fata;
    //O clasa abstracta poate sa continta un constructor;



    abstract void Munceste();
    abstract void Invata();

    public void detaliiPersoana (){
        System.out.println("Detaliile despre Persoana sunt :");
    }
}
