public class ConcreteLightWeightB extends LightWeight {

    private double db;

    public ConcreteLightWeightB(int a, char b, String c, double db) {
        super(a, b, c);
        this.db = db;
    }

    public ConcreteLightWeightB(ConcreteLightWeightB concreteLightWeightB) {
        super(concreteLightWeightB);
        this.db = concreteLightWeightB.db;
    }

    @Override
    public String whoAreYou() {
        return "ConcreteB " + db;
    }

    @Override
    public ConcreteLightWeightB clone() {
        return new ConcreteLightWeightB(this);
    }

    public void setDb(double db) {
        this.db = db;
    }

}
