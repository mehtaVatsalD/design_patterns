public class ConcreteLightWeightA extends LightWeight {

    private double da;

    public ConcreteLightWeightA(int a, char b, String c, double da) {
        super(a, b, c);
        this.da = da;
    }

    public ConcreteLightWeightA(ConcreteLightWeightA concreteLightWeightA) {
        super(concreteLightWeightA);
        this.da = concreteLightWeightA.da;
    }

    @Override
    public String whoAreYou() {
        return "ConcreteA " + da;
    }

    @Override
    public ConcreteLightWeightA clone() {
        return new ConcreteLightWeightA(this);
    }

    public void setDa(double da) {
        this.da = da;
    }

}
