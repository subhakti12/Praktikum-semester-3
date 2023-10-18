public class Matematika1 {
    public void Matematika() {
        int a = 20;
        int b = 10;

        // Pertambahan
        int hasilPertambahan = pertambahan(a, b);
        System.out.println("Pertambahan : " + a + " + " + b + " = " + hasilPertambahan);

        // Pengurangan
        int hasilPengurangan = pengurangan(10, 5);
        System.out.println("Pengurangan : " + 10 + " - " + 5 + " = " + hasilPengurangan);

        // Perkalian
        int hasilPerkalian = perkalian(10, 3);
        System.out.println("Perkalian : " + 10 + " * " + 3 + " = " + hasilPerkalian);

        // Pembagian
        double hasilPembagian = pembagian(21, 2);
        System.out.println("Pembagian : 21 / 2 = " + hasilPembagian);
    }

    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Pembagian oleh nol tidak diizinkan");
            return 0.0;
        }
    }
}