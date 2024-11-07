import java.util.Scanner;
public class inputotput3 {
public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("jenis kelamin: ");
    char jenisKleamin = input.nextLine(). charAt(0);
    System.out.println("nemer sepatu: ");
    int nomerSepatu = input.nextInt();
    System.out.println("sudah menikah: ");
    boolean sudahMenikah = input.nextBoolean();


    System.out.println("jenisKelamin" + jenisKleamin);
    System.out.println("nemerSepatu" + nomerSepatu);
    System.out.println("sudahMenikah" + sudahMenikah);
    input.close();
}
    
}

    

