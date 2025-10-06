/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_ZN_Sejahtera;

/**
 *
 * @author zulfa
 */
public class Produk {
    private String namaProduk;
    private int harga;
 
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void tampilkanInfo() {
        System.out.println("Nama produk: " + namaProduk);
        System.out.println("Harga      : Rp" + harga);
    }
}

class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, int harga, int garansi){
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

class Makanan extends Produk {
    private String tanggalKadaluarsa;
    
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa){
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal kadaluarsa: " + tanggalKadaluarsa);
    }
    
}

