package ba.unsa.etf.rpr;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public abstract class Predmet {
    protected String naziv;
    Map<Integer, Student> pred = new HashMap<>();
    protected int ects;

    Predmet() {
        naziv=new String();
        ects=0;
    }

    public void dodajStudenta(int indeks, Student s) {
        if(!this.pred.containsKey(indeks))
            this.pred.put(indeks, s);

    }

    public void izbaciStudenta(Student s) {
        pred.values().removeIf(val -> pred.equals(val));;
    }

    public String vratiSpisakStudenata() {
        String s=new String();
        Iterator<Integer> it = pred.keySet().iterator();
        while(it.hasNext()) {
            int key=it.next();
            s += key + " " + pred.get(key);
            s += "\n";
        }
        return s;
    }

}
