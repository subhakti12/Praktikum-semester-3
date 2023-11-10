import java.util.List;
// Kelas abstrak untuk abstraksi (Abstraction)
abstract class Pengguna {
    protected String nama;
    protected String jenisKelamin;

    public Pengguna(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    // Metode abstrak untuk Polymorphism
    public abstract void tampilInfo();
}

// Kelas turunan User
class User extends Pengguna {
    public User(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    // Implementasi metode abstrak untuk Polymorphism
    @Override
    public void tampilInfo() {
        System.out.println("=== Info User ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}

// Kelas turunan Admin
class Admin extends Pengguna {
    public Admin(String nama, String jenisKelamin) {
        super(nama, jenisKelamin);
    }

    // Implementasi metode abstrak untuk Polymorphism
    @Override
    public void tampilInfo() {
        System.out.println("=== Info Admin ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }

    // Metode untuk menambahkan buku
    public void tambahBuku(List<Buku> daftarBuku, Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    // Metode untuk melihat daftar buku
    public void lihatDaftarBuku(List<Buku> daftarBuku) {
        System.out.println("=== Daftar Buku ===");
        for (Buku buku : daftarBuku) {
            buku.tampilInfo();
        }
    }

    // Metode untuk menghapus buku
    public void hapusBuku(List<Buku> daftarBuku, Buku buku) {
        daftarBuku.remove(buku);
        System.out.println("Buku berhasil dihapus.");
    }
}

// Kelas Buku untuk menyimpan informasi buku
class Buku {
    private String judul;
    private String pengarang;
    private String genre;

    public Buku(String judul, String pengarang, String genre) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
    }

    // Metode untuk menampilkan informasi buku
    public void tampilInfo() {
        System.out.println("=== Info Buku ===");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Genre: " + genre);
    }
}