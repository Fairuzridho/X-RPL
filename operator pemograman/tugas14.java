import java.util.Scanner;
public class tugas14 {

    public static void main(String[] args) {
        // Daftar NIS siswa yang lulus
        int[] nisLulus = {1001, 1002, 1003, 1004};

        // Membuat Scanner untuk input user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIS: ");
        int inputNIS = scanner.nextInt();

        // Memeriksa apakah NIS ada dalam daftar
        boolean isLulus = false;
        for(int nis : nisLulus) {
            if (nis == inputNIS) {
                isLulus = true;
                break; 

        
    }
}
    
        // Menampilkan hasil 
        if (isLulus) {
            System.out.println("Status: true (Lulus)");
        }else{
            System.out.println("Status: false (Tidak Lulus)"); 
        }
    }
}