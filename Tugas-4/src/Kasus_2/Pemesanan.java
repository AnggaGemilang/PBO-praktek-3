/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus_2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author angga
 */
public class Pemesanan {
    private String namaPemesan;
    private HashMap<Makanan, Integer> daftarPesanan;
    private double totalHarga;
    private Date tglPemesanan;
    
    {
        daftarPesanan = new HashMap<>();
    }

    public Pemesanan(String namaPemesan, HashMap<Makanan, Integer> daftarPesanan, Date tglPemesanan){
        this.namaPemesan = namaPemesan;
        this.daftarPesanan = daftarPesanan;
        this.tglPemesanan = tglPemesanan;
        this.totalHarga = hitungTotal(daftarPesanan);
    }
    
    public double hitungTotal(HashMap<Makanan, Integer> daftarPesanan){
        double totalHarga = 0;  
        for (Map.Entry<Makanan, Integer> entry : daftarPesanan.entrySet()) {
            totalHarga += (double)((double)entry.getKey().getHarga()*(double)entry.getValue()); 
        }
        return totalHarga;
    }
    
    public String getNamaPemesan() {
        return namaPemesan;
    }

    public HashMap<Makanan, Integer> getDaftarPesanan() {
        return daftarPesanan;
    }
    public double getTotalHarga() {
        return totalHarga;
    }

    public String getTglPemesanan() {
        return tglPemesanan.getDay()+"/"+tglPemesanan.getMonth()+"/"+tglPemesanan.getYear()+" "+tglPemesanan.getHours()+":"+tglPemesanan.getMinutes();
    }
}
