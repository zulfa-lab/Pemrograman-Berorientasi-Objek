/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package membuatproduk;

/**
 *
 * @author zulfa
 */
public class Main {
    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java", 150000, "John Doe");
        Elektronik elektronik = new Elektronik("Smartphone", 3000000, "Samsung");
        Pakaian pakaian = new Pakaian("Kaos", 100000, "M");
        
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);
        
        System.out.println("Total harga setelah diskon: Rp " + keranjang.totalHarga());
    }
    
}
