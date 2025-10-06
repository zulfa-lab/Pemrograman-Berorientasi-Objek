/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package P_ZN_Sejahtera;

/**
 *
 * @author zulfa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Informasi dari dua kelas");
        Produk prdk1 = new Elektronik("Handphone", 6000000, 2);
        Produk prdk2 = new Makanan("Puding", 15000, "2025-10-10");
        
        Pegawai pgw1 = new PegawaiTetap("Zulfa", 15000000, 7000000);
        Pegawai pgw2 = new PegawaiKontrak("Nando", 10000000, 14);
        
        System.out.println("###### Data dari produk ###### ");
        prdk1.tampilkanInfo();
        System.out.println();
        prdk2.tampilkanInfo();
        
        System.out.println("\n###### Data dari Pegawai ######");
        pgw1.tampilkanInfo();
        System.out.println();
        pgw2.tampilkanInfo();
        
        
        
    }
    
}
