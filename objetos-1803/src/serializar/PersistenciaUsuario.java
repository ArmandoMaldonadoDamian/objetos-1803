/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-101
 */
import java.io.*;
public class PersistenciaUsuario {
    //primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //paso 1 generar archivo donde se guardara el serializado
        File file=new File("D:\\archivaldo.yomero");
        
      //paso 2 indicar que lo vamos a generar para escribir en el
      FileOutputStream fos=new FileOutputStream(file);
      
      //paso 3 escribir un obejto en el
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(c);
      oos.close();
        
    }
}
