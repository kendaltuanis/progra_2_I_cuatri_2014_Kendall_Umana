/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoapp.objetos;

/**
 *
 * @author carlos
 */
public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre) {
        this.nombre = nombre;
        this.saldo = 0;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }
    
    public void retiro(double monto){
        this.saldo -= monto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
    
}
