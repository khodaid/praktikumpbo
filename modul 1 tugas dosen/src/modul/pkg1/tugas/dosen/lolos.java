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
public class lolos{
    private String jeniskelamin;
    private int berat;
    
    
    
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
    
//    lolos (int berat,String jeniskelamin)
//    {
//        this.berat = berat;
//        this.jeniskelamin = jeniskelamin;
//    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
}
