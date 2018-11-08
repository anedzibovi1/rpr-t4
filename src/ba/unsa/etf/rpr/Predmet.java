package ba.unsa.etf.rpr;

public abstract class Predmet {
    protected String naziv;
    protected String spisak;
    protected int ects;
    Predmet() {
        naziv=new String();
        spisak=new String();
        ects=0;
    }
}
