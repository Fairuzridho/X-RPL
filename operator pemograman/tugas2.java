import java.io.*;

public class tugas2 {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try {
            tugas2 t = new tugas2();
            System.out.print("Masukkan nilai a: ");
            int A = Integer.parseInt(t.input.readLine());

            System.out.print("Masukkan nilai b: ");
            int B = Integer.parseInt(t.input.readLine());

            System.out.print("Masukkan nilai c: ");
            int C = Integer.parseInt(t.input.readLine());

            int hasil = A + B * C;
            System.out.println("-------Hasil-------");
            System.out.println("Hasil : " + hasil);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

