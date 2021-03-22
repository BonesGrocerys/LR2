package logicacalculator;

public class Conjunctor {
    public boolean X;
    public boolean Y;
    public Conjunctor(boolean x, boolean y) {
        X = x;
        Y = y;
    }
    public boolean Calc() {
        return (X && Y);
    }

}
