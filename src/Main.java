import logicacalculator.Conjunctor;
import logicacalculator.Disjuncher;

public class Main {
    public static void main(String[] args) {
        Conjunctor c1 = new Conjunctor(true,true);
        Conjunctor c2 = new Conjunctor(true,false);
        Conjunctor c3 = new Conjunctor(false,true);
        Conjunctor c4 = new Conjunctor(false,false);
        Disjuncher d1 = new Disjuncher(true,true);
        Disjuncher d2 = new Disjuncher(true,false);
        Disjuncher d3 = new Disjuncher(false,true);
        Disjuncher d4 = new Disjuncher(false,false);

        System.out.println(c1.X + " AND " + c1.Y + " = " + c1.Calc());
        System.out.println(c2.X + " AND " + c2.Y + " = " + c2.Calc());
        System.out.println(c3.X + " AND " + c3.Y + " = " + c3.Calc());
        System.out.println(c4.X + " AND " + c4.Y + " = " + c4.Calc());
        System.out.println();
        System.out.println(d1.X + " OR " + d1.Y + " = " + d1.Calc());
        System.out.println(d2.X + " OR " + d2.Y + " = " + d2.Calc());
        System.out.println(d3.X + " OR " + d3.Y + " = " + d3.Calc());
        System.out.println(d4.X + " OR " + d4.Y + " = " + d4.Calc());


    }
}
