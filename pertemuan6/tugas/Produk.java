/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package membuatproduk;
import java.util.ArrayList;

abstract class Produk {
    String nama;
    double harga;
    
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    public abstract double hitungDiskon();
}

class Buku extends Produk {
    String penulis;
    
    public Buku(String nama, double harga, String penulis) {
        super(nama, harga);
        this.penulis = penulis;
    }
    
    @Override
    public double hitungDiskon() {
        return harga * 0.1;
    }
}

class Elektronik extends Produk {
    String merk;
    
    public Elektronik(String nama, double harga, String merk) {
        super(nama, harga);
        this.merk = merk;
    }
    @Override
    public double hitungDiskon(){
        return harga * 0.15;
    }
}

class Pakaian extends Produk {
    String ukuran;
    
    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }
    
    @Override
    public double hitungDiskon() {
        return harga *  0.2;
    }
}

class KeranjangBelanja {
    private ArrayList<Produk> produkList;
    
    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    
    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }
    
    public double totalHarga() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.harga - produk.hitungDiskon();
        }
        return total;
    }
}
