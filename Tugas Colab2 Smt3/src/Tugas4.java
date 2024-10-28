import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("Selamat datang di Kalkulator hitung luas");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Segitiga");
            System.out.print("Pilih No 1-3: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi persegi: ");
                    double sis = input.nextDouble();
                    double luasP = sis * sis;
                    System.out.println("Luas Persegi adalah: " + luasP + " cm²");
                    ulang = false;
                    break;

                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panj = input.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double leb = input.nextDouble();
                    double luasPP = panj * leb;
                    System.out.println("Luas Persegi Panjang adalah: " + luasPP + " cm²");
                    ulang = false;
                    break;

                case 3:
                    System.out.print("Masukkan alas segitiga: ");
                    double al = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double ting = input.nextDouble();
                    double luasPS = 0.5 * al * ting;
                    System.out.println("Luas Segitiga adalah: " + luasPS + " cm²");
                    ulang = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, pilih no 1-3.");
                    break;
            }
        }

        input.close();
    }
}
