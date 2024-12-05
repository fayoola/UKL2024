import java.util.Arrays;
import java.util.Scanner;
public class soal3ke3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            
            System.out.println("Masukkan jumlah elemen array: ");
            int n = s.nextInt();
    
            // Membuat array
            int[] array = new int[n]; 
    
            //input
            System.out.println("Masukkan angka-angka array! ");
            for (int i = 0; i < n; i++) { //looping sesuai dengan jumlah elemnt yg diinputkan
                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
                array[i] = s.nextInt();  
        }
    
            //menampilkan
            System.out.println("Angka-angka yang ada di dalam array: ");
            for (int i = 0; i < array.length; i++) { 
                System.out.print(array[i] + " "); 
            }
            System.out.println("\n"); 
            for (int i = 0; i < array.length; i++) {
                
                boolean sudahDihitung = false; //blum ada proses hitung/cek
                
                for (int j = 0; j < i; j++) {
                    if (array[i] == array[j]) {
                        sudahDihitung = true;
                        break;
                    }
                }
                if (!sudahDihitung) {  //menghitung frekuensi-negasi
                    int frekuensi = 0;
                    for (int k = 0; k < array.length; k++) {
                        if (array[i] == array[k]) {
                            frekuensi++;
                        }
                    }
                    System.out.println(array[i] + " muncul " + frekuensi + " kali"); 
            }
        }
        s.close();
    }
}