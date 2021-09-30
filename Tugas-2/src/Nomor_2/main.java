/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angga
 */
public class main {
    public static void main(String[] argss){
        String[][] arrData = new String[3][2];
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String mentahan;
            for(int i = 0; i < 3; i++) {
                mentahan = input.readLine();
                arrData[i] = (mentahan.split("\\s+"));
            }
            System.out.println("================================");
            for(String[] data : arrData) {
                System.out.println(String.format("%-15s", data[0]).toLowerCase() + String.format("%3s", data[1]).replace(" ", "0"));
            }
            System.out.println("================================");            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
