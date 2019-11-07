/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07060.modul.pkg3;

public class Pegawai extends Manusia {
    
    int id;
    String kataSandi;
    
    void setId(int id){
        this.id = id;
    }
    
    int getId(){
        return id;
    }
    
    void setKataSandi(String kataSandi){
        this.kataSandi = kataSandi;
    }
    
    String getKataSandi(){
        return kataSandi;
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}