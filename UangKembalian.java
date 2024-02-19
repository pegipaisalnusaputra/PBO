public class UangKembalian {
    public static void main(String[] args) {
        //harga barang
        
        double hargaBarang = 70000;
        System.out.println("harga total belanja anda: "+ hargaBarang);

        //uang yang dibayarkan
        double uangBayar = 100000;
        System.out.println("jumlah uang yang dibayarkan: " + uangBayar);
        
        //hitung kembalian 
        double kembalain = uangBayar - hargaBarang;
        
        //tampilkan kembalian
        System.out.println("Kembaliannya adalah: "+ kembalain);
    }
}
