public class Balok extends Perhitungan{
    private double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }
    @Override
    public double Volume() {
        return p * l * t;
    }

    @Override
    public double LuasPermukaan() {
        return 2 * (p * l + p * t + l * t);
    }
}
