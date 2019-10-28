/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.modul.pkg3;
import java.util.*;
/**
 *
 * @author khoirul-06990
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pemesanan[] pesan = new Pemesanan[2];
        Kiriman[] kirim = new Kiriman[2];
        int pilih, banyak = 0;
        do {
            System.out.println("===============================================");
            System.out.println("                   Menu");
            System.out.println("===============================================");
            System.out.print("1. Admin  ");
            System.out.print("2. Pemesan    ");
            System.out.print("3. Kurir  \n");
            System.out.print("masukan pilihan menu : ");
            pilih = input.nextInt();
            System.out.println("===============================================\n");
                switch (pilih)
                {
                    case 1:
                        System.out.print("1. Pesanan ");
                        System.out.println("2. Status Barang  ");
                        System.out.print("masukan pilihan anda : ");
                        int satu = input.nextInt();
                        switch (satu)
                        {
                            case 1:
                                System.out.println("===============================================");
                                System.out.println("                 Pesanan Masuk");
                                System.out.println("===============================================");
                                for (Pemesanan Pesan : pesan) {
                                    if (Pesan != null){
                                    System.out.println("Nama              : "+Pesan.getNama());
                                    System.out.println("Nama Produk       : "+Pesan.getNamaBarang());
                                    System.out.println("Jumlah Barang     : "+Pesan.getJumlahBarang());
                                    System.out.println("Alamat Pengiriman : "+Pesan.getAlamatPemesanan());
                                    System.out.println("Harga Total       : "+Pesan.getHargaTotal());
                                    }
                                    else
                                    {
                                        break;
                                    }
                                    System.out.println("===============================================\n");
                                }
                                break;

                            case 2:
                                System.out.println("===============================================");
                                System.out.println("                Laporan Pemesanan");
                                System.out.println("===============================================");
                                for (int i=0; i<pesan.length; i++)
                                {
                                    if(kirim[i]!=null)
                                    {
                                        kirim[i] = new Kiriman(kirim[i].getNama(), kirim[i].getNamaBarang(), kirim[i].getAlamatPemesanan());
                                        kirim[i].setStatus("Dikirim");
                                        kirim[i].laporanKiriman();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                break;
                        }
                        break;

                    case 2:
                        System.out.print("1. Beli Produk ");
                        System.out.print("2. Status Barang  ");
                        System.out.println("3. Harga Total    ");
                        System.out.print("masukan pilihan anda : ");
                        int dua = input.nextInt();
                        switch (dua)
                        {
                            case 1:
                                System.out.println("===============================================");
                                System.out.println("                    Beli Produk");
                                System.out.println("===============================================");
                                String ulang;
                                int jml = 0;
                                do{
                                    System.out.print("masukan nama  : ");
                                    String nama = input.next();
                                    System.out.print("masukan nama barang : ");
                                    String namaBarang = input.next();
                                    System.out.print("masukan jumlah yang di beli : ");
                                    int jumlah = input.nextInt();
                                    System.out.println("masukan alamat pengiriman : ");
                                    String alamat = input.next();
                                    pesan[jml] = new Pemesanan(nama, namaBarang, alamat, jumlah);
                                    kirim[jml] = new Kiriman(pesan[jml].getNama(), pesan[jml].getNamaBarang(), pesan[jml].getAlamatPemesanan());
                                    kirim[jml].setStatus("Disiapkan");
                                    System.out.print("apakah anda ingin membeli lagi? (y/n) : ");
                                    ulang = input.next();
                                    jml++;
                                }while(ulang.equals("y"));
                                System.out.println("===============================================\n");
                                break;

                            case 2:
                                System.out.println("===============================================");
                                System.out.println("                Status Pemesanan");
                                System.out.println("===============================================");
                                System.out.println("masukan nama anda : ");
                                String name = input.next();
                                int i = 0;
                                while(!name.equals(pesan[i].getNama()))
                                {
                                    i++;
                                }
                                System.out.println("Nama              : "+pesan[i].getNama());
                                System.out.println("Nama Barang       : "+pesan[i].getNamaBarang());
                                System.out.println("Alamat Pengiriman : "+pesan[i].getAlamatPemesanan());
                                System.out.println("Ststus Pengiriman : "+kirim[i].getStatus());
                                break;

                            case 3:
                                System.out.println("===============================================");
                                System.out.println("                   Harga Total");
                                System.out.println("===============================================");
                                System.out.println("masukan nama anda : ");
                                name = input.next();
                                i = 0;
                                while(!name.equals(pesan[i].getNama()))
                                {
                                    i++;
                                }
                                System.out.println("Harga Total : "+pesan[i].getHargaTotal());
                            break;
                        }
                            System.out.println("===============================================");
                            break;
                        
                    case 3:
                        System.out.println("===============================================");
                        System.out.println("                 Kiriman Barang");
                        System.out.println("===============================================");
                        System.out.println("1. laporan pengiriman   2. verifikasi pengiriman");
                        System.out.print("masukan pilihan anda : ");
                        int tiga = input.nextInt();
                        switch(tiga)
                        {
                            case 1:
                                for (int i =0; i<pesan.length; i++)
                                {
                                    if (pesan[i]!=null)
                                    {
                                        kirim[i].laporanKiriman();
                                    }
                                    else
                                    {
                                        break;
                                    }
                                }
                                break;
                                
                            case 2:
                                System.out.print("masukan alamat pengiriman :");
                                String alamat = input.next();
                                int i = 0;
                                while(!kirim[i].getAlamatPemesanan().equals(alamat))
                                {
                                    i++;
                                }
                                if(kirim[i].getAlamatPemesanan().equals(alamat))
                                {
                                    kirim[i].setStatus("Telah Diterima");
                                    System.out.println(kirim[i].getStatus());
                                }
                        }
                        break;
                }
        }while(pilih<4 && pilih>0);
    }
    
}
