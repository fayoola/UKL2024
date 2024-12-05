import java.util.Scanner;

public class soal1ke2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); //menginputkan data
    
            // Input bilangan
            System.out.print("Masukkan bilangan: ");
            int bilangan = input.nextInt();
    
            // Cek ganjil atau genap
            if (bilangan % 2 == 0) { // % 2 jika habis dibagi maka bilangan genap 
                System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
            }
            input.close();
        }
    }