/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiar;

import java.util.ArrayList;

/**
 *
 * @author Particular
 */
public class GeneradorTarjetas {
     private ArrayList<Cliente> clientes;

    public GeneradorTarjetas() {
        clientes=new ArrayList<>();
        clientes.add(new Cliente("Juan", new Tarjeta(1234, "Banamex", 32000)));

}

 public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.clientes = cliente;
    }  }
