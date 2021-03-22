package logicacalculator;

public class Disjuncher {
    public boolean X;
    public boolean Y;

    public Disjuncher(boolean x, boolean y) {
        X = x;
        Y = y;
    }

    public boolean Calc() {
        return (X || Y);
    }

}
