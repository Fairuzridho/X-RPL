import java.util.Scanner;

public class percabangan8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan angka pertama: ");
    int AngkaPertama = scanner.nextInt();

    System.out.print("Masukkan angka kedua: ");
    int AngkaKedua = scanner.nextInt();

    if (AngkaPertama % 2 == 0) {
      System.out.println(AngkaPertama + " adalah genap.");
    } else {
      System.out.println(AngkaPertama + " adalah ganjil.");
    }

    if (AngkaKedua % 2 == 0) {
      System.out.println(AngkaKedua + " adalah genap.");
    } else {
      System.out.println(AngkaKedua + " adalah ganjil.");
    }
  }
}
