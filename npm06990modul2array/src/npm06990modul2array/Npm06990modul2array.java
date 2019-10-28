/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06990modul2array;

class pegawai
{
    int[] nip = new int[4];
    String[] nama = new String[4];
    String[] jabatan = new String[4];
    
    void tambah(int no,int a, String b, String c)
    {
        nip[no-1] = a;
        nama[no-1] = b;
        jabatan[no-1] = c;
    }
    
    void tampil()
    {
        int i = 0;
        System.out.println("===DATA PEGAWAI===");
        while(i<4)
        {
            System.out.println(nama[i]+"->"+jabatan[i]);
            i++;
        }
        System.out.println("==================");
    }
}
public class Npm06990modul2array {
    
    public static void main(String[] args) {
        pegawai karyawan = new pegawai();
        karyawan.tambah(1, 1, "andy", "programer");
        karyawan.tambah(2, 2, "budi", "designer");
        karyawan.tambah(3, 3, "cici", "PM");
        karyawan.tambah(4, 4, "didi", "programer");
        karyawan.tampil();
    }
    
}
