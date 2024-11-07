
    

public class tugas4 {
    public static void main(String[] args) {
        // Nilai siswa
        int nilai1 = 80;
        int nilai2 = 95;
        int nilai3 = 75;

        // Menghitung total nilai
        int total = 0;
        total += nilai1; // total = total + nilai1
        total += nilai2; // total = total + nilai2
        total += nilai3; // total = total + nilai3

        // Menghitung rata-rata nilai
        double rataRata = total / 3.0; // menggunakan 3.0 untuk mendapatkan hasil double

        // Menampilkan hasil
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}