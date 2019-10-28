/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.tugas.dosen;

import java.util.Scanner;

/**
 *
 * @author khoirul-06990
 */
public class Modul1TugasDosen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PT. Maju");
        System.out.print("masukan berat anda : ");
        int berat = input.nextInt();
        System.out.print("masukan jenis kelamin anda : ");
        String jenis = input.next();
        System.out.print("masukan tinggi anda : ");
        int tinggi = input.nextInt();
        
        lolos Lolos = new lolos();
        ideal Ideal = new ideal(berat, jenis);
        
        String Hasil = Lolos.Test(berat, jenis);
        String hasil = Ideal.PengecekanIdeal(tinggi, jenis);
        
        System.out.println("anda di nyatakan " + Hasil);
        System.out.println("menurut berat badan anda " + hasil);
    }
}
