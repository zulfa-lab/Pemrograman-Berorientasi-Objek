/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum5;

/**
 *
 * @author zulfa
 */
public class Main {
    public static void main(String [] args) {
        System.out.println("Informasi Kendaraan Darat Mobil:");
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.jumlahroda = 6;
        mobil.tampilkanInfo();
                   
        SepedaMotor motor = new SepedaMotor();
        System.out.println("\nInformasi Kendaraan Darat Sepeda Motor:");
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.jumlahroda = 2;
        motor.tampilkanInfo();
    }
}