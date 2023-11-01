public class Kubus extends Perhitungan{
    private double s;

    public Kubus(double s) {
        this.s = s;
    }

    @Override
    public double Volume() {
        return s*s*s;
    }

    @Override
    public double LuasPermukaan() {
        return 6 * s * s;
    }
}
