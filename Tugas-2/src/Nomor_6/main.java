/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author angga
 */
public class main {
    public static void main(String[] args){
        BigInteger[] arrData = new BigInteger[2];
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i = 0; i < 2; i++) {
                arrData[i] = BigInteger.valueOf(Long.parseLong(input.readLine()));
            }
            System.out.println(arrData[0].add(arrData[1]));
            System.out.println(arrData[0].multiply(arrData[1]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
