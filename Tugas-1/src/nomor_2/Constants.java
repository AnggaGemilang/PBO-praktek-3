package nomor_2;

public class Constants {
    public static void main(String[] args){
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight *
        CM_PER_INCH);
        // YANG INI
        System.out.println("INI PANGGILAN " + Constants2.CM_PER_INCH_STATIC);
    }
}

