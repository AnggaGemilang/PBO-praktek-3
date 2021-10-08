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
class Siswi{
    String nama;
    int nim;
    int nilai;
    {
        nilai = 100;
    }
    public Siswi(String nama, int nim){
        this.nama = nama;
        this.nim = nim;
    }   
    public void getSiswa(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.nim);
        System.out.println("Nilai : " + this.nilai);
    }
}
public class ContohNonStatic {
    public static void main(String[] args){
        Siswi anggi = new Siswi("Anggi", 201511063);
        anggi.getSiswa();
    }
}
