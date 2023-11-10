public class Hewan {
    protected String jenis_Suara;

    public Hewan() {
        this.jenis_Suara = "Bunyi Hewan";
    }

    public void bersuara() {
        System.out.println(jenis_Suara);
    }
}