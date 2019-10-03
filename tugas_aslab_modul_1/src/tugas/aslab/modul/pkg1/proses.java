/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.aslab.modul.pkg1;

import java.util.Scanner;

/**
 *
 * @author khoirul-06990
 */
public class proses {
    String hasil, jenis;
    int berat;
    
    public String Test(int berat, String JenisKelamin)
    {
        String Hasil=" ";
       if (JenisKelamin.equals("laki-laki"))
       {
         if (berat>56 && berat<=70)
         {
             Hasil = "LOLOS";
         }
         else
         {
             Hasil = "GUGUR";
         }
       }
       else if(JenisKelamin.equals("perempuan"))
       {
           if (berat>51 && berat<=66)
         {
             Hasil = "LOLOS";
         }
         else
         {
             Hasil = "GUGUR";
         }
       }
       return Hasil;
    }
    public void input() {

        Scanner input = new Scanner(System.in);
        
        System.out.println("PT. Maju");
        System.out.print("masukan berat anda : ");
        berat = input.nextInt();
        System.out.print("masukan jenis kelamin anda : ");
        jenis = input.next();
    }
    public void output()
    {
        hasil = Test(berat,jenis);
        System.out.println("anda di nyatakan " + hasil);
    }
}
