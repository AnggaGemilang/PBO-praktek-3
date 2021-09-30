/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angga
 */
public class main {
    static int hitungJmlPenjualan(int jmlPenjualan, int persentase){
        int hasil = (int)((double)persentase/(double)100 * (double)(50000 * jmlPenjualan));
        return hasil;
    }
    public static void main(String[] argss){
        final int gajiPokok = 500000;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            int jmlPenjualan = Integer.parseInt(input.readLine());
            if(jmlPenjualan >= 40){
                System.out.println(gajiPokok + hitungJmlPenjualan(jmlPenjualan, 25));
            } else if (jmlPenjualan > 80){
                System.out.println(gajiPokok + hitungJmlPenjualan(jmlPenjualan, 35));
            } else if (jmlPenjualan < 15){
                System.out.println(gajiPokok - hitungJmlPenjualan(15-jmlPenjualan, 15));
            } else if (jmlPenjualan >= 15 && jmlPenjualan < 40) {
                System.out.println(gajiPokok + hitungJmlPenjualan(jmlPenjualan, 10));                
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
