package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PlanStudija {
    Map<Integer, Predmet> mapa = new HashMap<>();

    public void dodaj(int semestar, Predmet pred) {
        if(!this.mapa.containsKey(semestar))
            this.mapa.put(semestar, pred);

    }

    public void izbaciPredmet(Predmet pred) {
        mapa.values().removeIf(val -> pred.equals(val));;
    }

    public String vratiSpisakPredmeta() {
        String s=new String();
        Iterator<Integer> it = mapa.keySet().iterator();
        while(it.hasNext()) {
            int key=it.next();
            s += key + " " + mapa.get(key);
            s += "\n";
        }
        return s;
    }

    public int vratiBrojPredmeta() {return mapa.size();}
}
