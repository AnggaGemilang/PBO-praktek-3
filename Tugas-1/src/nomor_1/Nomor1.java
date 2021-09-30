package nomor_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Nomor1 {
    public static void main(String[] args){
        ArrayList<String> arrList = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            System.out.print("Masukkan nilai : ");
            while(!(line = input.readLine()).equals("stop")){
                arrList.add(line);
                System.out.print("Masukkan nilai : ");
            }
            arrList.forEach(value -> {
                try {
                    Long numberValue = Long.parseLong(value);
                    System.out.println(numberValue + " can be fitted in:");
                    if(numberValue >= Byte.MIN_VALUE && numberValue <= Byte.MAX_VALUE){
                        System.out.println("* byte");
                    }
                    if(numberValue >= Short.MIN_VALUE && numberValue <= Short.MAX_VALUE){
                        System.out.println("* short");
                    }
                    if(numberValue >= Integer.MIN_VALUE && numberValue <= Integer.MAX_VALUE){
                        System.out.println("* int");
                    }
                    if(numberValue >= Long.MIN_VALUE && numberValue <= Long.MAX_VALUE){
                        System.out.println("* long");
                    }     
                } catch(NumberFormatException e){
                    System.out.println(value + " can't be fitted anywhere.");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}