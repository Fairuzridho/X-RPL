import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("nama sekolah: ");
        String namaSekolah = input.nextLine();
        System.out.println("jarak ke Sekolah: ");
        Double jarakSekolah = input.nextDouble();

        input.nextLine();
        
        System.out.println("plat nomor: ");
        char platNomor = input.nextLine(). charAt(0);
        System.out.println("anak ke berapa: ");
        int anakKeBerapa = input.nextInt();

        System.out.println("nama sekolah: " + namaSekolah);
        System.out.println("jarak ke sekolah: " + jarakSekolah);
        System.out.println("plat Nomor: " + platNomor);
        System.out.println("anak Ke Berapa: " + anakKeBerapa);
        input.close();

    }

    
}
    

