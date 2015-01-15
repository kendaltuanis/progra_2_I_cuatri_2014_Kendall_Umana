/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp;

import bancoapp.objetos.Banco;
import bancoapp.objetos.Cliente;
import bancoapp.objetos.Cuenta;
import java.util.List;

/**
 *
 * @author carlos
 */
public class BancoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco oBanco = crearDatosPrueba();
        Cliente clienteActual = oBanco.login("juan", "12345");
        if (clienteActual == null){
            System.out.println("Usuario y Clave incorrectas");
            return;
        }
        System.out.println("Bienvenido: " + clienteActual.getUsuario());
        System.out.println("----------------------------------------");
        System.out.println("-----------------Saldos-----------------");
        System.out.println("----------------------------------------");
        List<Cuenta> cuentas = clienteActual.getCuentas();
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.getNombre() + " => " + cuenta.getSaldo());
        }
        System.out.println("----------------------------------------");
        
    }
    
    public static Banco crearDatosPrueba(){
        Banco oBanco = new Banco("Banco Genérico");
        
        Cliente juan = new Cliente("juan", "12345");
        Cuenta colonesJuan = new Cuenta("Colones");
        colonesJuan.depositar(90000);
        colonesJuan.retiro(50000);
        
        Cuenta dolaresJuan = new Cuenta("Dólares");
        dolaresJuan.depositar(90000);
        dolaresJuan.retiro(50000);
        
        juan.nuevaCuenta(colonesJuan);
        juan.nuevaCuenta(dolaresJuan);
        
        oBanco.nuevoCliente(juan);
        
        return oBanco;
    }
    
}
