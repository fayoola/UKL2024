import java.util.Scanner;

public class soal1ke3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 50; i >= 1; i--) { //menghitung 50 sampai 1
            System.out.println(i + " ");
            if (i == 1) { //untuk mencetak saya senang
                System.out.println("saya senang!");
            } else {
                switch (i % 3) {
                    case 0:
                        System.out.println("saya angkatan 33"); //habis
                        break;
                    case 1:
                        System.out.println("Saya anak wikusama"); //sisa 1
                        break;
                    case 2:
                        System.out.println("Saya anak moklet"); //sisa 2
                        break;
                }
            }
        }
        input.close();
    }
}