/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp.objetos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlos
 */
public class Banco {
    
    private final String nombre;
    private final List<Cliente> clientes;
    public Banco(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
    }
    
    public void nuevoCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public Cliente login(String usuario, String clave){
        for(Cliente cliente : this.clientes){
            if(cliente.getClave().equals(clave) && cliente.getUsuario().equals(usuario)){
                return cliente;
            }
        }
        return null;
    }
}
