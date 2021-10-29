/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;

import java.util.ArrayList;

/**
 *
 * @author angga
 */
public class Customer {
    
    private String nama;
    private String noTelp;
    private Alamat alamat;
    private String tglLahir;
    private char gender;
    
    public Customer(String jalan, int rt, int rw, String kecamatan, String kelurahan, 
            String provinsi, String nama, String noTelp, String alamat, String tglLahir, 
            char gender){
        
        this.alamat = new Alamat(jalan, rt, rw, kecamatan, kelurahan, provinsi);
        
        this.nama = nama;
        this.noTelp = noTelp;
        this.tglLahir = tglLahir;
        this.gender = gender;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {  
        this.tglLahir = tglLahir;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
        
}
