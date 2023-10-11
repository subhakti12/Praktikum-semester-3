public class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public void membaca() {
        System.out.println(nama + " sedang membaca buku novelnya yang dia suka");
    }

    public void nyontek() {
        System.out.println(nama + " sedang Menyontek pekerjaan teman sekelasnya");
    }

    public void modifikasi() {
        System.out.println(nama + " sedang memodifikasi projek akhir kuliahnhya.");
    }
}
