package ba.unsa.etf.rpr;

public class Semestar {
    private int ects;
    PlanStudija plan;
    Semestar() {plan=new PlanStudija();}
    Semestar(PlanStudija p) {plan=p;}
    public PlanStudija dajPlanStudija() {return plan;}


}
