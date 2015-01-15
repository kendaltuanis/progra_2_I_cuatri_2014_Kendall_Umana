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
public class Cliente {
    private String usuario;
    private String clave;
    private List<Cuenta> cuentas;
    public Cliente(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.cuentas = new ArrayList<>();
    }
    
    public void nuevaCuenta(Cuenta cuenta){
        this.cuentas.add(cuenta);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }
    
    
}
