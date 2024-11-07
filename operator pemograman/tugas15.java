import java.util.Scanner;

public class tugas15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("progam operasi demontrasi operator bitwise");

        //input nilai a
        System.out.print("masukkan nilai a");
        int a = scanner.nextInt();

        //input nilai b
        System.out.print("masukkan nilai b");
        int b = scanner.nextInt();

        // operasi bitwise
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int notA = ~a;
        int notB = ~b;
        int leftShift = a << b;
        int rightShift = a >> b;
        
        // menampilkan hasil
        System.out.println("/nHasil Operasi Bitwise");
        System.out.println("a & b = " + and);
        System.out.println("a | b = " + or);
        System.out.println("a ^ b = " + xor);
        System.out.println("~a = " + notA);
        System.out.println("~b = " + notB);
        System.out.println("a << b = " + leftShift);
        System.out.println("a >> b =" + rightShift);
        scanner.close();
    }    
}