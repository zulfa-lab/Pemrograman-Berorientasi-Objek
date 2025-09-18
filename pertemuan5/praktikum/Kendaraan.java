/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author zulfa
 */
class Kendaraan {
    String nama;
    int kecepatan;
   
    
    public void tampilkanInfo()  {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
}   
}
class Kendaraandarat extends Kendaraan {
    int jumlahroda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah roda: " + jumlahroda);
    }
}
       
// Kelas Turunan Mobil
class Mobil extends Kendaraandarat {
    int jumlahPintu;
           
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
           }
}       
        // Kelas Turunan Sepeda motor
class SepedaMotor extends Kendaraandarat {
    
    String jenisMesin;
               
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
        }
    }