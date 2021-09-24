package nomor_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Strings {
    
    public static int jumlahKarakter(ArrayList<String> arr){
        int jml = 0;
        jml = arr.stream().map(value -> value.length()).reduce(jml, Integer::sum);
        return jml;
    }
    
    public static String concate(ArrayList<String> arr){
        String kalimat = "";
        kalimat = arr.stream().map(value -> value + " ").reduce(kalimat, String::concat);
        return kalimat;
    }
    
    public static boolean lexi(ArrayList<String> arr){
        return arr.get(0).compareTo(arr.get(1)) > 0;
    }
    
    public static void main(String[] args){
        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
            ArrayList<String> arrList = new ArrayList<>();
            String line = "";
            System.out.print("Masukkan kata : ");
            while (!(line = input.readLine()).equals("stop")){
                arrList.add(line);
                System.out.print("Masukkan kata : ");
            }
            System.out.println(jumlahKarakter(arrList));
            System.out.println(lexi(arrList) ? "Yes" : "No");
            System.out.println(concate(arrList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}