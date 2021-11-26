/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

/**
 *
 * @author angga
 */
public class HexadecimalException extends Exception {
    
    private final String message;
 
    public HexadecimalException() {
        super();
        message = "Bukan Merupakan Format Hexadecimal";
    }
 
    public HexadecimalException(String message) {
        super();
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
    
}
