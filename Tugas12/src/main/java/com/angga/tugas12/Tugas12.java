/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angga.tugas12;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author angga
 */
public class Tugas12 {
    
    public static void main(String[] args) throws IOException{
        
        try {
            ObjectMapper mapper = new ObjectMapper();
            
            ArrayList<Pesanan> pesanan;
            
            pesanan = new ArrayList<>(Arrays.asList(mapper.readValue(Paths.get("./barang.json").toFile(), Pesanan[].class)));

            System.out.println('|' + StringUtils.center("Product Name", 23, ' ') 
                    + '|' + StringUtils.center("Quantity", 10, ' ') 
                    + '|' + StringUtils.center("Weight", 10, ' ') 
                    + '|' + StringUtils.center("Destination", 15, ' ')
                    + '|' + StringUtils.center("Service", 26, ' ')
                    + '|' + StringUtils.center("Value", 9, ' ')
                    + '|' + StringUtils.center("Total", 9, ' ') + '|');
                   
            pesanan.forEach(item -> {
                System.out.println(item.toString());
            });
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }    
    
}
