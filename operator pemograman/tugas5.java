import javax.swing.JOptionPane;

public class tugas5 {
    public static void main(String[] args) {
        // Jumlah awal barang
        int sirup = 5;
        int deterjen = 6;
        int mieInstan = 10;

        // Input jumlah tambahan barang dari distributor
        String inputSirup = JOptionPane.showInputDialog("Masukkan jumlah tambahan sirup:");
        String inputDeterjen = JOptionPane.showInputDialog("Masukkan jumlah tambahan deterjen:");
        String inputMieInstan = JOptionPane.showInputDialog("Masukkan jumlah tambahan mie instan:");

        // Mengonversi input ke integer
        int tambahanSirup = Integer.parseInt(inputSirup);
        int tambahanDeterjen = Integer.parseInt(inputDeterjen);
        int tambahanMieInstan = Integer.parseInt(inputMieInstan);

        // Menambahkan jumlah barang menggunakan operator assignment
        sirup += tambahanSirup;         // sirup = sirup + tambahanSirup
        deterjen += tambahanDeterjen;   // deterjen = deterjen + tambahanDeterjen
        mieInstan += tambahanMieInstan; // mieInstan = mieInstan + tambahanMieInstan

        // Menampilkan hasil akhir
        String hasil = "Jumlah barang setelah penambahan:\n" +
                       "Sirup: " + sirup + " botol\n" +
                       "Deterjen: " + deterjen + " bungkus\n" +
                       "Mie Instan: " + mieInstan + " bungkus";

        JOptionPane.showMessageDialog(null, hasil);
    }
}