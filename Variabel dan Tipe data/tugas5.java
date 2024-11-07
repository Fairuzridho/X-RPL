public class Main {
    public static void main (String[] args) {
        final String namaToko = "pemadam kelaparan";
        final int hargaPokok = 27000;
        
        int hargaPromo = hargaPokok - 10000;
        int hargaReseller = hargaPokok - 20000;
        
        System.out.println("Harga pokok : " + hargaPokok);
        System.out.println("Harga Promo : " + hargaPromo);
        System.out.println("Harga Reseller : " + hargaReseller);
    }
}