/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDatos;

/**
 *
 * @author T-101
 */
public class Tipos1 {
    public static void main(String[] args) {
        byte b=127;
        short s=2;
        int i=2;
        long l=2;
        
        b=(byte)s;
        s=b;
        i=b;
        l=i;
        b=(byte)l;
        s=(byte)i;
        float f=4;
        String malo="4";
         int bueno= Integer.parseInt(malo);
         
    }
}
