/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;
public class Hewan {
    public void bersuara() {
        System.out.println("Hewan bersuara ");
    }
    public void makan (String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    public void makan (String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + " porsi " + makanan);
    }
}
class Kucing extends Hewan {
    @Override
        public void bersuara() {
        System.out.println("Meow");
  }
}

class Anjing extends Hewan {
    @Override
    public void bersuara() {
        System.out.println("Woof");
    }
}