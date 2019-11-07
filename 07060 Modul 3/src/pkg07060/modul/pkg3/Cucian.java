/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07060.modul.pkg3;

public class Cucian {
    
    Pegawai pegawai;
    Pelanggan pelanggan;
    float berat;
    float hargaTotal;
    
    void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    Pegawai getPegawai(){
        return pegawai;
    }
    
    void setPelanggan(Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    
    Pelanggan getPelanggan(){
        return pelanggan;
    }
    
    void setBerat(float berat){
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat() * perKilo;
    }
    
    float getBerat(){
        return berat;
    }
    
    float getHargaTotal(){
        return hargaTotal;
    }

}

    

