import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Buku> daftarBuku = new ArrayList<>();

        Admin admin = new Admin("Admin A", "Laki-laki");
        admin.tambahBuku(daftarBuku, new Buku("Java Programming", "John Doe", "Programming"));
        admin.tambahBuku(daftarBuku, new Buku("Data Structures", "Jane Smith", "Computer Science"));

        admin.lihatDaftarBuku(daftarBuku);

        User user = new User("User B", "Perempuan");

        user.tampilInfo();

        System.out.println("=== Daftar Buku untuk User ===");
        for (Buku buku : daftarBuku) {
            buku.tampilInfo();
        }
        admin.lihatDaftarBuku(daftarBuku);
    }
}
