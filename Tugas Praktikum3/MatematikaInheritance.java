public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mat = new Matematika2();

        System.out.println("Hasil Tambah  = " + mat.tambah(20, 10));
        System.out.println("Hasil Kurang  = " + mat.kurang(10, 5));
        System.out.println("Hasil Kali    = " + mat.kali(10, 3));
        System.out.println("Hasil Bagi    = " + mat.bagi(21, 2));
        System.out.println("Hasil Modulus = " + mat.modulus(21, 2));
    }
}

