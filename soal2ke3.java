import java.util.Scanner;
import java.util.Random;

public class soal2ke3 {
    public static void perkalian(int angka1, int angka2, Scanner s) { // PERKALIAN //Scanner s membaca inputan dari user
        int hasil = angka1 * angka2;
        System.out.println("Berapakah hasil perkalian antara " + angka1 + " * " + angka2 + "?");
        int jawaban = s.nextInt();
        if (jawaban == hasil) {  //memeriksa jawaban
            System.out.println("BENAR! 100 untukmu!");
        } else {
            System.out.println("TETOT SALAH! Jawaban yang benar adalah " + hasil);
        }
    }

    public static void pembagian(int angka1, int angka2, Scanner s) { // PEMBAGIAN
        int hasil = angka1 / angka2;
        System.out.println("Berapakah hasil pembagian antara " + angka1 + " / " + angka2 + "?");
        int jawaban = s.nextInt();
        if (jawaban == hasil) {
            System.out.println("BENAR! 100 untukmu!");
        } else {
            System.out.println("TETOT SALAH! Jawaban yang benar adalah " + hasil);
        }
    }

    public static void modulus(int angka1, int angka2, Scanner s) { // MODULUS
        int hasil = angka1 % angka2;
        System.out.println("Berapakah hasil modulus antara " + angka1 + " % " + angka2 + "?");
        int jawaban = s.nextInt();
        if (jawaban == hasil) {
            System.out.println("BENAR! 100 untukmu!");
        } else {
            System.out.println("TETOT SALAH! Jawaban yang benar adalah " + hasil);
        }
    }

    public static String bertanya(Scanner s) { //pengulangan bermain-akan diloop di do while //method bertanya 
        System.out.println("Apakah Anda ingin bermain lagi? (ya/no)");
        return s.next();
    }

    public static void main(String[] args) { //memasuki main method
        Scanner s = new Scanner(System.in);
        Random rand = new Random(); //angka acak
        String lanjut;

        do { 
            int angka1 = rand.nextInt(10) + 1; //rentan angka 1-10
            int angka2 = rand.nextInt(10) + 1;
        
            System.out.println("Pilih Operator \n1. Perkalian (*) \n2. Pembagian (/) \n3. Modulus (%)");
            System.out.println("======================");
            int pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    perkalian(angka1, angka2, s);
                    break;
                case 2:
                    pembagian(angka1, angka2, s);
                    break;
                case 3:
                    modulus(angka1, angka2, s);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih 1, 2, atau 3.");
            }

            lanjut = bertanya(s); //menggunkan do while karena kita perlu menanyakan kpd user apakah ingin bermian lagi/tidak
        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("Terima kasih sudah bermain baybay!");
        s.close();
    }
}