/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1.tugas.dosen;

/**
 *
 * @author khoirul-06990
 */
public class ideal extends lolos{
    int tinggi;
    //lolos Lolos= new lolos();
    //String hasil = Lolos.Test(berat, jeniskelamin);
    ideal (int a, String b)
    {
        this.berat = a;
        this.jeniskelamin = b;
    }
    String PengecekanIdeal (int tinggi ,String jeniskelamin)
    {
     int men = (tinggi-100)-((tinggi-100)*10/100), woman = (tinggi-100)-((tinggi-100)*15/100);
     String hasil = "";
     if(jeniskelamin.equals("laki-laki"))
     {
         if(berat==(men))
                 {
                    hasil = "idel"; 
                 }
         else if(berat>(men))
         {
             hasil = "kurusin dikit. berat ideal " +men;
         }
         else if(berat<(men))
         {
             hasil = "gemukin dikit. berat ideal "+men;
         }
     }
     else if(jeniskelamin.equals("perempuan"))
     {
         if(berat==(woman))
                 {
                    hasil = "idel"; 
                 }
         else if(berat>(woman))
         {
             hasil = "kurusin dikit. berat ideal "+woman;
         }
         else if(berat<(woman))
         {
             hasil = "gemukin dikit. berat ideal "+woman;
         }
     }
     return hasil;
    }
    
}
