/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angga
 */
public class Cara2 {
    public static void main(String[] args){
        String mentahan;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            mentahan = input.readLine();
            String[] splitString = (mentahan.split("\\s+|!|,|\\?|\\.|_|'|@"));
            System.out.println(splitString.length);
            System.out.println(mentahan.replaceAll("\\s+|!|,|\\?|\\.|_|'|@", "\n"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}