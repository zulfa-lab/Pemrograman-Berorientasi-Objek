/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3;

/**
 *
 * @author zulfa
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing =  new Hewan("Mimi", 3);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Hewan anjing = new Hewan("Dogi", 5);
        anjing.suara();
        anjing.info();
        anjing.berlari();
    }
        
    }

