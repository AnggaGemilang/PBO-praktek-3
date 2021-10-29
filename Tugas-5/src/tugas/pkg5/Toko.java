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
public class Toko {
    private String nama;
    private String deskripsi;
    private ArrayList<Produk> daftarProduk;
    
    {
        daftarProduk = new ArrayList<>();
    }
    
    public Toko(String nama, String deskripsi){
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    
    public void addProduk(Produk produk){
        daftarProduk.add(produk);
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public ArrayList<Produk> getDaftarProduk() {
        return daftarProduk;
    }

    public void setDaftarProduk(ArrayList<Produk> 
            daftarProduk) {
        this.daftarProduk = daftarProduk;
    }
    
}
