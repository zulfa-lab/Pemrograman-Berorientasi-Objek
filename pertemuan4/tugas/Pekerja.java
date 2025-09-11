/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author zulfa
 */
public class Pekerja extends Manusia {
    private double gaji; // Atribut tambahan khusus 
    
    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    
    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    // Override metode toString()
    
    public String toString() {
        return "Informasi Pekerja: " + 
                "\nNama: " + getNama() +
                "\nUsia: " + usia +
                "\nPekerjaan: " + pekerjaan +
                "\nGaji: Rp" + String.format("%,.2f", gaji);
    }
}
