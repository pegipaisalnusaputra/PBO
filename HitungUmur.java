import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //tahun sekarang
        // jika langsung ditampung dalam variabel, langsung tulis : int thnSekarang = 2024;
        System.out.println("Sekarang adalah tahun: ");
        int thnSekarang = scanner.nextInt();

        //tahun lahir
        //jika langsung ditampung dalam variable, langsung tulis : int thnLahir = 1995;
        System.out.println("Masukkan tahun lair: ");
        int thnLahir = scanner.nextInt();
       
        //hitung umur
        int umur = thnSekarang - thnLahir;
        
        //tampilkan umur
        System.out.println("umur anda sekarang adalah: " + umur);

        scanner.close();
    }
}
