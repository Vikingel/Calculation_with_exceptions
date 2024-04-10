public class Multiply implements Calculation {
    int a;
    int b;
    public double calc(){
        return a*b;
    }

    @Override
    public int calc(int a, int b) {
        return a*b;
    }
}
