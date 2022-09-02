public abstract class LightWeight implements Prototype {

    private int a;
    private char b;
    private String c;

    public LightWeight(int a, char b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public LightWeight(LightWeight lightWeight) {
        this(lightWeight.a, lightWeight.b, lightWeight.c);
    }

    public abstract String whoAreYou();

    public abstract LightWeight clone();

    public void setA(int a) {
        this.a = a;
    }

    public void setB(char b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "LightWeight{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", whoAreYou='" + whoAreYou() + '\'' +
                '}';
    }
}
