/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author angga
 */
public class Restaurant {
    private final Makanan[] makanan;
    private final ArrayList<Pemesanan> pemesanan;
    private static byte id;
    
    {
        makanan = new Makanan[10];
        pemesanan = new ArrayList<>();
        setId((byte) 0);
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.getMakanan()[getId()] = new Makanan(nama, harga, stok);
    }
    
    public void tampilPemesanan(){ 
        for(int i = 0; i < pemesanan.size(); i++){
            System.out.println(pemesanan.get(i).getNamaPemesan() + "\t\t" + pemesanan.get(i).getTglPemesanan() + "\t Rp. " + pemesanan.get(i).getTotalHarga());
        }
    }
    
    public void tampilMenuMakanan(){ 
        for(int i = 0; i <= getId(); i++){
//            if(!makanan[i].isOutOfStock()){
                System.out.println(getMakanan()[i].getNama() +"["+ getMakanan()[i].getStok()+"]"+"\tRp. "+ getMakanan()[i].getHarga());
//            }
        }
    }
    
    public void tambahPesanan(){
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            HashMap<Makanan, Integer> daftarPesanan = new HashMap<>();
            System.out.print("Masukkan Nama Anda : "); String nama = input.readLine();
            System.out.print("Ingin melakukan berapa pesanan : "); int jmlPesanan = Integer.parseInt(input.readLine());
            tampilMenuMakanan();
            for(int i = jmlPesanan; i > 0; i--){
                System.out.print("Pilih Makanan : "); int pilihMakanan = Integer.parseInt(input.readLine());
                if(makanan[pilihMakanan-1].getStok() != 0){
                    System.out.print("Masukkan Kuantitas : "); int qty = Integer.parseInt(input.readLine());
                    this.makanan[pilihMakanan-1].setKurangiStok(qty);
                    daftarPesanan.put(makanan[pilihMakanan-1], qty);
                } else {
                    System.out.println("Stok sudah habis!");
                    i++;
                }
            }
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String date = df.format(new Date());
            this.pemesanan.add(new Pemesanan(nama, daftarPesanan, date));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void nextId(){
        setId((byte)(getId() + 1));
    }
    
    public static byte getId() {
        return id;
    }

    public static void setId(byte uid) {
        id = uid;
    }

    public Makanan[] getMakanan() {
        return makanan;
    }
}