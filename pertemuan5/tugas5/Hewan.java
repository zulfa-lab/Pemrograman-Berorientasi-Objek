/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;
public class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfoHewan() {
        System.out.println("Nama hewan: " + nama);
        System.out.print("Jenis: " + jenis);        
    }
}
// Kelas turunan Kucing
class Kucing extends Hewan {
    String suara;
    
    @Override
    public void tampilkanInfoHewan() {
        super.tampilkanInfoHewan();
        System.out.println("\nSuara: " + suara);
    }   
}

// Kelas Turunan Anjing
class Anjing extends Hewan {
    String suara;
    
    @Override
    public  void tampilkanInfoHewan() {
        super.tampilkanInfoHewan();
        System.out.println("\nSuara: " + suara);
    }
}


