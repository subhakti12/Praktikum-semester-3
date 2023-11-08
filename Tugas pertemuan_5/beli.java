import java.util.Scanner;
public class beli {
public static void main( String[] args ){
    int potongan, hasil;
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukkan total pembelian Anda: ");
    int pembelian = masukan.nextInt();
    if(pembelian < 50000){
        potongan = pembelian * 5 / 100;
        hasil = pembelian - potongan;
    } else {
        potongan = pembelian * 20 / 100;
        hasil = pembelian - potongan;
    }
    System.out.print("besarnya potongan: "+potongan+"\nJumlah yang harus dibayar: "+hasil);
}
}

//nama, prodi, smeester, target ipk