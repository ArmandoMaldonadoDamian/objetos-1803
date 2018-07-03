/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class PrimerasExcepciones {
    
    public static void main(String[] args) {
        float a=2;
        int b=0;
        //System.out.println(a/b);// es una excepcion aritmetica todo numero dividido entre 0 es error
        int arreglo[]={3,4,2};//
        System.out.println("HOLA MUNDO");
        //System.out.println(arreglo [3]); el indice del arreglo esta fuera del limite
        String numeroMalo="cuatro";
        int numeroBueno=Integer.parseInt(numeroMalo);
        System.out.println(numeroBueno*2);
        System.out.println("NO ME VERAS!!");
        
    }
}