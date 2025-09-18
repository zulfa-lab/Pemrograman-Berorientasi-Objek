/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas5;
public class Main {
    public static void main(String[] args) {
        System.out.println("Informasi hewan anjing: ");
        Anjing anjing = new Anjing();
        anjing.nama = "Choko";
        anjing.jenis = "Samoyed";
        anjing.suara = "woof";
        anjing.tampilkanInfoHewan();
        
        System.out.println("\nInformasi hewan kucing: ");
        Kucing kucing = new Kucing();
        kucing.nama = "Molly";
        kucing.jenis = "Jawa";
        kucing.suara = "Miauw";
        kucing.tampilkanInfoHewan();
    }  
}
