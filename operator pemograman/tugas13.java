import java.util.Scanner;

public class tugas13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pertanyaan dan pilihan jawaban
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("1. Operator Indosat");
        System.out.println("2. Operator Aritmatika");
        System.out.println("3. Operator Telkomsel");
        System.out.println("4. Operator Assignment");
        System.out.print("Silakan pilih jawaban (1-4): ");

        // Input jawaban dari user
        int jawaban = scanner.nextInt();

        // Memeriksa jawaban
        boolean jawabanBenar = (jawaban == 2 || jawaban == 4);

        // Menampilkan hasil
        if (jawabanBenar) {
            System.out.println("Jawaban Anda benar!");
        } else {
            System.out.println("Jawaban Anda salah. Jawaban yang benar adalah 'Operator Aritmatika' dan 'Operator Assignment'.");
        }

        scanner.close();
    }
}