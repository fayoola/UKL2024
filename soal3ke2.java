import java.util.Arrays;
import java.util.Scanner;

public class soal3ke2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //untuk menginputkan data
        int[] array = {1,2,3,6,2,5}; //deklarasi array
        System.out.println("Menampilkan array = " +Arrays.toString(array));//tostring untuk menampilkan data yang ada di array
        
        boolean adaDuplikat = false; //untuk tanda bahwa data belum dicek
        
        for (int i = 0; i < array.length; i++) { //array.length untuk mengakses tiap elemen array 
            for (int j = i + 1; j < array.length; j++) { //j untuk menyimpan elemen array2
                if (array[i] == array[j]) {//mengecek elemnt duplikat
                    adaDuplikat = true;//boolean true krn terdapat angka duplikat
                    System.out.println("Terdapat Array duplikat yaitu: " + array[i]);
                    break;
                }
            }
            if (adaDuplikat) {
                break;
            }
        }
        if (!adaDuplikat) { // negasi untuk mengmbalikan tipe data boolean jika ada angka yang terduplikat-tdk ada duplikat
            System.out.println("Tidak terdapat array duplikat");
        }
        s.close();
    }
}