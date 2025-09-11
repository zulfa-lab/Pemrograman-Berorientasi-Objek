/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;
    public class Main {

    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Budiman", 30, "Web Developer", 15000000);
        
        // Menampilkan informasi pekerja
        System.out.println("Informasi Awal");
        System.out.println(pekerja1.toString());
        System.out.println();
        
        // Mengubah nama menggunakan setter
        pekerja1.setNama("Budi Budiman");
        
        // Menampilkan informasi pekerja setelah diubah
        System.out.println("Setelah nama diubah");
        System.out.println(pekerja1.toString());
        System.out.println();
        
        // Contoh akses atribut
        System.out.println("COntoh akses atribut");
        
        // Akses atribut pekerjaan (public) 
        System.out.println("Akses langsung pekerjaan (public): " + pekerja1.pekerjaan);
        pekerja1.pekerjaan = "Senior web developer";
        System.out.println("Setelah diubah langsung: " + pekerja1.pekerjaan);
        
        System.out.println("Akses nama (private) harus menggunakan getter: " + pekerja1.getNama());
        
        
        System.out.println("Akses gaji (private) harus menggunakan getter: Rp" +
                String.format("%,.2f", pekerja1.getGaji()));
    }
    
}
