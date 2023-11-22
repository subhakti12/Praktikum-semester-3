public class perulangan {
    public static void main(String[] args) {
        // a. Menghitung Deret bilangan prima dan bukan dari 0 – 20
        System.out.println("a. Menghitung Deret bilangan prima dan bukan dari 0 – 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }

        // b. Menghitung Deret bilangan ganjil dan genap dari 0 – 20
        System.out.println("\nb. Menghitung Deret bilangan ganjil dan genap dari 0 – 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }

        // c. Huruf Z – A
        System.out.println("\nc. Menampilkan Huruf Z – A:");
        char ch = 'Z';
        while (ch >= 'A') {
            System.out.print(ch + " ");
            ch--;
        }

        // d. Lagu “Anak Ayam Turun N”
        System.out.println("\n\nd. Lagu 'Anak Ayam Turun N' menggunakan do-while:");
        int n = 5;
        int count = n;
        do {
            System.out.println("Anak ayam turun " + count + ", mati satu tinggal " + (count - 1));
            count--;
        } while (count > 0);
    }

    // Helper function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
