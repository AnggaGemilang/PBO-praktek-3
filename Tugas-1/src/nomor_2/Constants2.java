package nomor_2;

public class Constants2 {
    public static final double CM_PER_INCH_STATIC = 2.54;
    public static void main(String[] args){    
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH_STATIC + " by " + paperHeight * CM_PER_INCH_STATIC);
//        ERROR
//        System.out.println(Constants.CM_PER_INCH);
    }
}


