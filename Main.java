/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pert3;

/**
 *
 * @author zulfa
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Mobil pertama:");
        Mobil mobil1 = new Mobil("Ferrari", "SF25", 2025, "Merah");
        mobil1.displayInfo();
        
        System.out.println("\nMobil kedua:");
        Mobil mobil2 = new Mobil("Redbull", "RB19", 2023, "Hitam");
        mobil2.displayInfo();
        
        mobil1.startEngine();
        mobil2.startEngine();
        
        mobil2.setWarna("Putih special livery Japanese GP");
        
        System.out.println("\nSetelah warna diubah:");
        mobil2.displayInfo();
    }
}

