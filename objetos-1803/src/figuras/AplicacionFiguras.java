/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class AplicacionFiguras {
    public static void main(String[] args) {
        
        try {
            //creamos un no ojbejo de tipo cuadrado
            Cuadrado c=new Cuadrado();
            //ajustamos el valor del lado
            ValidarValores.validarNoNegativo(20);
            c.setLado(4);
            
            //generamos un objeto de tipo calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c));
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
