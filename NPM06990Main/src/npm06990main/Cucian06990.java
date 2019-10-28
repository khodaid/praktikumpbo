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
public class Cucian06990 {
    Pegawai06990 pegawai;
    Pelanggan06990 pelanggan;
    float berat;
    float hargaTotal;

    Pegawai06990 getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai06990 pegawai) {
        this.pegawai = pegawai;
    }

    Pelanggan06990 getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan06990 pelanggan) {
        this.pelanggan = pelanggan;
    }

    float getBerat() {
        return berat;
    }

    public void setBerat(float berat) {
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat()*perKilo;
    }

    float getHargaTotal() {
        return hargaTotal;
    }
    
    
}
