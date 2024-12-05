import java.util.Scanner;

public class soal2ke1 {
    public static void main(String[] args) {
        
        System.out.println("Selamat Datang di Faktorial!");
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Positif: ");
        int bil = s.nextInt();

        if (bil < 0) {
            System.out.println("Bilangan harus Positif");
        } else {
            int faktorial = 1;
            
            for (int i = 1; i <= bil; i++) {
                faktorial *= i; //menghitung faktorial
            }
            System.out.println("Hasil Faktorial dari " + bil + " adalah " + faktorial);
        }
        s.close();
    }
}