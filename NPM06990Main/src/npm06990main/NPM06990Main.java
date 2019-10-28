/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package npm06990main;

/**
 *
 * @author khoirul-06990
 */
import java.util.ArrayList;
import java.util.Scanner;
public class NPM06990Main {

    /**
     * @param args the command line arguments
     */

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Pegawai06990> pegawaiArr = new ArrayList<>();
    static ArrayList<Pelanggan06990> pelangganArr = new ArrayList<>();
    static ArrayList<Cucian06990> cucianArr = new ArrayList<>();

    public static void main(String[] args) {
        int menu;
        
        do{
            System.out.println("\n\nSistem Informasi Laundry RPL!!!");
            NPM06990Main.tampilkanData();
            
            System.out.println("\n\nMenu : ");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi");
            System.out.println("0. Selesai");
            
            System.out.println("Masukan nomer menu");
            menu = scan.nextInt();
            
            switch(menu){
                case 1:
                    NPM06990Main.tambahKasir();
                    break;
                case 2:
                    NPM06990Main.tambahPelanggan();
                    break;
                case 3 :
                    NPM06990Main.tambahCucian();
                    break;
                default :
                    menu = 0;
                    System.out.println("Terimakasih telah menggunakan sistem informasi laundry RPL!!!");
            }
        }
        while(menu != 0);
    }
    static void tampilkanData(){
        System.out.println("\n\nData Pegawai");
        for(int i=0;i<pegawaiArr.size();i++){
            System.out.println("ID Pegawai      : "+pegawaiArr.get(i).getId()+", Nama : "+pegawaiArr.get(i).getNama()+", No HP : "+pegawaiArr.get(i).getNoHp());
        }
        System.out.println("\n\nData Pelanggan : ");
        for(int i=0;i<pelangganArr.size();i++){
            System.out.println("ID Pelanggan : "+pelangganArr.get(i).getId()+"Nama : "+pelangganArr.get(i).getNama()+", NO HP : "+pelangganArr.get(i).getNoHp());
        }
        System.out.println("\n\nData Cucian : ");
        for(int i=0;i<cucianArr.size();i++){
            System.out.println("Nama Pegawai : "+cucianArr.get(i).getPegawai().getNama()+"Nama Pelanggan : "+cucianArr.get(i).getPelanggan().getNama()+", Berat : "+cucianArr.get(i).getBerat()+" KG, Harga total cucian : "+cucianArr.get(i).getHargaTotal());
        }
    }
    static void tambahKasir(){
        System.out.println("Tamba Data Pegawai !!!");
        Pegawai06990 pegawai =new Pegawai06990();
        System.out.println("ID Pegawai : "+String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.println("Nama Pegawai : ");
        pegawai.setNama(scan.next());
        System.out.println("Kata sandi Pegawai : ");
        pegawai.setKataSandi(scan.next());
        System.out.println("Nomor HP Pegawai : ");
        pegawai.setNoHp(scan.next());
        pegawaiArr.add(pegawai);
    }
        static void tambahPelanggan(){
            System.out.println("Tambah Pelanggan !!!");
            Pelanggan06990 pelanggan = new Pelanggan06990();
            System.out.println("ID Pelanggan : "+String.valueOf(pelangganArr.size()+1));
            pelanggan.setId(pelangganArr.size()+1);
            System.out.println("Nama Pelanggan : ");
            pelanggan.setNama(scan.next());
            System.out.println("Nomor HP Pelanggan : ");
            pelanggan.setNoHp(scan.next());
            pelangganArr.add(pelanggan);

        }
        static void tambahCucian(){
            System.out.println("Tambah Data Cucian!");
            Cucian06990 cucian = new Cucian06990();
            System.out.print("ID Pegawai : ");
            cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
            System.out.println("ID Pelanggan : ");
            cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
            System.out.println("Berat cucian (KG): ");
            cucian.setBerat(scan.nextFloat());
            System.out.println("Harga totalnya adalah : Rp."+cucian.getHargaTotal());
            cucianArr.add(cucian);
        }
}
