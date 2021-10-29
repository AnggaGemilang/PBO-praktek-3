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
public class OnlineShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Toko dadangStore = new Toko("Dadang Store", "Toko Terpercaya");
        
        Kategori handphone = new Kategori("Handphone", "Ini adalah deskripsi handphone");
        
        Produk aipon = new Produk("AX7891", "Iphone 13", "Hape bagus", 20);

        aipon.addKategori(handphone);

        Produk kulkas = new Produk("AZ1891", "Polytron", "Kulkas bagus", 20);
        Produk mos = new Produk("BD7121", "Lojitek", "Mouse bagus", 20);
        
        Customer angga = new Customer("Jalan Ciguruik No. 53", 02, 13, 
                "Cileunyi", "Cibiru", "Jawa Barat", "Angga Gemilang", 
                "08319510230", "Ciguruwik", "2002/08/24", 'L');          
        
        System.out.println(angga.getNama() + " Membeli " + aipon.getNama() + 
                ", " + kulkas.getNama() + ", " + mos.getNama());
       
        dadangStore.addProduk(aipon);
        dadangStore.addProduk(kulkas);
        dadangStore.addProduk(mos);
        
        
        
    }
    
}
