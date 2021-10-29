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
public class Produk {
    
    private String kodeProduksi;
    private String nama;
    private String deskripsi;
    private ArrayList<Kategori> kategori;
    private int stok;
    
    {
        kategori = new ArrayList<>();
    }

    public Produk(String kodeProduksi, String nama, 
            String deskripsi, int stok){
        this.kodeProduksi = kodeProduksi;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.stok = stok;
    }
    
    public ArrayList<Kategori> getKategori(){
        return kategori;
    }
    
    public void addKategori(Kategori kategori){
        this.kategori.add(kategori);
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

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode_produksi() {
        return kodeProduksi;
    }

    public void setKode_produksi(String kodeProduksi) {
        this.kodeProduksi = kodeProduksi;
    }
    
}
