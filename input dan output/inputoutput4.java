
import java.util.Scanner;

public class inputoutput4 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     System.out.print("nama lengkap: ");
     String namaLengkap = input.nextLine();
     System.out.print("NIS: ");
     int NIS = input.nextInt();
     input.nextLine();
     System.out.print("umur: ");
     int umur = input.nextInt();

     System.out.println("nama lengkap:  "+namaLengkap);
     System.out.println("NIS:  "+NIS);
     System.out.println("umur:  "+umur);   
     input.close();



    }
    
}
