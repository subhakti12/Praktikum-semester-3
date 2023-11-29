import java.util.Scanner;

public class TokoSerbaAda {
    static class Barang {
        String kode;
        String nama;
        int harga;
        int jumlahBeli;

        public Barang(String kode, String nama, int harga) {
            this.kode = kode;
            this.nama = nama;
            this.harga = harga;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TOKO SERBA ADA");
        System.out.println("---------------");
        System.out.print("Masukkan Jumlah Item Barang = ");
        int jumlahBarang = scanner.nextInt();

        Barang[] daftarBarang = new Barang[jumlahBarang];

        // Input data barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Masukkan Kode Barang = ");
            String kodeBarang = scanner.next();

            // Validasi kode barang
            if (!kodeBarang.equals("a001") && !kodeBarang.equals("a002") && !kodeBarang.equals("a003")) {
                System.out.println("Kode barang tidak valid. Silakan coba lagi.");
                i--; // Mengulang input data barang yang tidak valid
                continue;
            }

            System.out.print("Masukkan Jumlah Beli = ");
            int jumlahBeli = scanner.nextInt();

            // Menyimpan data barang ke dalam array
            daftarBarang[i] = new Barang(kodeBarang, "", 0);
            daftarBarang[i].jumlahBeli = jumlahBeli;
        }

        // Menampilkan tabel
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("------------------");
        System.out.printf("%-4s %-15s %-15s %-10s %-15s %-15s\n", "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Total Harga");
        System.out.println("===========================================================================================================================");

        int totalBayar = 0;

        // Input dan menampilkan data belanja
        for (int i = 0; i < jumlahBarang; i++) {
            // Menentukan nama barang dan harga berdasarkan kode
            switch (daftarBarang[i].kode) {
                case "a001":
                    daftarBarang[i].nama = "Buku";
                    daftarBarang[i].harga = 3000;
                    break;
                case "a002":
                    daftarBarang[i].nama = "Pensil";
                    daftarBarang[i].harga = 4000;
                    break;
                case "a003":
                    daftarBarang[i].nama = "Pulpen";
                    daftarBarang[i].harga = 5000;
                    break;
            }

            int totalHargaBarang = daftarBarang[i].harga * daftarBarang[i].jumlahBeli;

            System.out.printf("%-4s %-15s %-15s %-10s %-15s %-15s\n", (i + 1), daftarBarang[i].kode, daftarBarang[i].nama, daftarBarang[i].harga, daftarBarang[i].jumlahBeli, totalHargaBarang);
            totalBayar += totalHargaBarang;
        }

        // Menampilkan total pembayaran
       System.out.println("===========================================================================================================================");
        System.out.println("Total Bayar Keseluruhan: Rp " + totalBayar);
        System.out.println("===========================================================================================================================");
    }
}
