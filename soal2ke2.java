import java.util.Scanner;
public class soal2ke2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();
        System.out.println("Masukkan tinggi tabung: ");
        double t = input.nextDouble();
        
        System.out.println("Volume tabung adalah: " + hitungVolumeTabung(r, t) + "cm kubik");
        System.out.println("Luas permukaan tabung adalah:" + hitungLuasTabung(r, t) + "cm persegi");

    }
    public static double hitungVolumeTabung(double r, double t) { //fungsi paramenter, mengihtung volume tabung
        return Math.PI * r * r * t;
    }
    public static double hitungLuasTabung(double r, double t){
        return 2 * Math.PI * r * (r + t);
    }
}