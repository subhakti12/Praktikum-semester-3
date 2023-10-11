public class Nilai {
     String NIM;
     String Nama;
     double NilaiAbsen;
     double NilaiTugas;
     double NilaiUTS;
     double NilaiUAS;

    public Nilai(String NIM, String Nama, double NilaiAbsen, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.NilaiAbsen = NilaiAbsen;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }

    public double HitungNilaiAkhir() {
        return (0.1 * NilaiAbsen) + (0.2 * NilaiTugas) + (0.3 * NilaiUTS) + (0.4 * NilaiUAS);
    }

    public void CetakNilai() {
        double NilaiAkhir = HitungNilaiAkhir();
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai Absen (10%): " + NilaiAbsen);
        System.out.println("Nilai Tugas (20%): " + NilaiTugas);
        System.out.println("Nilai UTS (30%): " + NilaiUTS);
        System.out.println("Nilai UAS (40%): " + NilaiUAS);
        System.out.println("Nilai Akhir: " + NilaiAkhir);
    }
}
