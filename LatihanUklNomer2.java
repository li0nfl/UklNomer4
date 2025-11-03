/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanuklnomer2;

/**
 *
 * @author li0nfl
 */
import java.util.Scanner;
public class LatihanUklNomer2 {

    static double hitungVolume(double jariJari, double tinggi) {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        return volume;
    }
    
    public static void main (String[] args) {
    Scanner inputan = new Scanner(System.in);
    
            System.out.println("Masukkan Jari Jari Tabung: ");
            double r = inputan.nextDouble();
            
            System.out.println("Masukkan Tinggi Tabung: ");
            double t = inputan.nextDouble ();
            
            double hasil = hitungVolume(r, t);
            
            System.out.println("Volume Tabung Adalah: "+ hasil + " cm³");
}
        
    }

