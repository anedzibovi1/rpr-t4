package ba.unsa.etf.rpr;

public class ObavezniPredmet extends Predmet{
    ObavezniPredmet(String ime, int poeni) {
        naziv=ime;
        ects=poeni;
    }
    public int dajBrojECTSPoena() {return this.ects;}
    public String dajNazivPredmeta() {return this.naziv;}


}
