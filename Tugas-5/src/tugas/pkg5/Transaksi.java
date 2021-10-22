/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg5;

/**
 *
 * @author angga
 */
public final class Transaksi {
    
    private final String namaProduk;

    public Transaksi(Produk produk){
        this.namaProduk = produk.getNama();
    }
    
    public String getNamaProduk() {
        return namaProduk;
    }

}
