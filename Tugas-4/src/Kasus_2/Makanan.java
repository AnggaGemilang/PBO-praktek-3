/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus_2;

/**
 *
 * @author angga
 */
public class Makanan {
    private String nama;
    private double harga;
    private int stok;

    public Makanan(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public boolean isOutOfStock(){
        return getStok() == 0;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }    
    
    public void setKurangiStok(int stok) {
        this.stok -= stok;
    }
}
