/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_3;

/**
 *
 * @author angga
 */
class Siswa {
    String nama;
    int nim;
    public Siswa(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }   
    public void getSiswa(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
    }
}
public class ContohConstructor {
    public static void main(String[] args){
        Siswa angga = new Siswa("Angga Gemilang", 201511036);
        angga.getSiswa();
    }
}
