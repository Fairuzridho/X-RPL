import java.util.Scanner;

public class percabangan3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai angka: ");
        int nilai = scanner.nextInt();
        scanner.close();
        
        String nilaiHuruf;
        
        if (nilai >= 81 && nilai <= 100) {
            nilaiHuruf = "A";
        } else if (nilai >= 71 && nilai <= 80) {
            nilaiHuruf = "B";
        } else if (nilai >= 51 && nilai <= 70) {
            nilaiHuruf = "C";
        } else if (nilai >= 21 && nilai <= 50) {
            nilaiHuruf = "D";
        } else if (nilai >= 0 && nilai <= 20) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "Nilai tidak valid";
        }
        
        System.out.println("Nilai huruf: " + nilaiHuruf);
    }
}