import java.util.Scanner;

public class percabangan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("selamat! Anda mendapatkan gantungan kunci");
        } else {
            int selisihbelanja = 500000 - belanja;
            System.out.println("Belanja anda kurang dari  Rp. 500.000");
            System.out.println("silahkan tambah lagi belanjanya senilai Rp. " + selisihbelanja);
            System.out.println("agar bisa mendapatkan bonus gantungan kunci");
            input.close();
        }
    }
}

        