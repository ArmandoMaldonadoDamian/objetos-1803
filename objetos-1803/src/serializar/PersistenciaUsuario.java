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
import java.util.ArrayList;
public class PersistenciaUsuario {
    //primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //paso 1 generar archivo donde se guardara el serializado
        ArrayList<Cliente> clientes=new ArrayList<>();
        File file=new File("archivaldo.yomero");
        if(file.exists())clientes=leer();
        clientes.add(c);
        
      //paso 2 indicar que lo vamos a generar para escribir en el
      FileOutputStream fos=new FileOutputStream(file);
      
      //paso 3 escribir un obejto en el
      ObjectOutputStream oos=new ObjectOutputStream(fos);
      oos.writeObject(clientes);
      oos.close();
        
    }
    public static ArrayList<Cliente> leer()throws Exception{
        //para leer ponemos el archivo
        File file=new File("archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Cliente> clientes=(ArrayList<Cliente>) ois.readObject();
        return clientes;
        
    }
}
