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
public class Cara1 {
    public static void main(String[] args){
        int jmlTokens = 1;
        String[] arrTokens = {"","","",""};
        String mentahan;
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            mentahan = input.readLine();
            for(int i = 0; i < mentahan.length(); i++) {
                if(mentahan.charAt(i) == ' ' || mentahan.charAt(i) == '!' || mentahan.charAt(i) == ',' || mentahan.charAt(i) == '?' || mentahan.charAt(i) == '.'|| mentahan.charAt(i) == '_'|| mentahan.charAt(i) == '\'' || mentahan.charAt(i) == '@' ) {
                    jmlTokens++;
                } else {
                   arrTokens[jmlTokens-1] += mentahan.charAt(i);
                }
            }
            System.out.println(jmlTokens);
            for(String token : arrTokens){
                System.out.println(token);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
