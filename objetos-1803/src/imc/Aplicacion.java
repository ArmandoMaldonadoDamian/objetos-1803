/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author T204
 */
public class Aplicacion {
    public static void main(String[] args) {
        Usuario u=new Usuario();
        
        u.setAltura((float)1.82);
        u.setPeso(84);
        
        Imc i=new Imc();
        i.setUsuario(u);
        
        System.out.println(i.masa());
        if(i.masa()>=0 & i.masa()<20){
            System.err.println("Bajo de peso,posible anemia");
        }
       else if(i.masa()>=20 & i.masa()<25){
            System.err.println("Peso ideal, normal");
        }
        if(i.masa()>25){
            System.err.println("Sobrepeso");
    }}
}
        

