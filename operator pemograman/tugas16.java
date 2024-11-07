import java.util.Scanner;
public class tugas16 {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("masukkan nilai siswa");
    int nilai = scanner.nextInt();

    String hasil = (nilai >= 75) ? "naik kelas" : "tIDAK NAIK KELAS";

    System.out.println("hasil : " + hasil );
    scanner.close();

}
    
}
    

