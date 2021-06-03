/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.poo.javaflix;

/**
 *
 * @author MARCOSTUF
 */
public class TarjetaDeCredito {
    
    private String NumTarjeta;
    private String FechaTarjeta;
    private String Saldo;
    
    public void getTarjeta(String par){
        return getTarjeta(NumTarjeta+FechaTarjeta+Saldo);
    }
    
    
    }
    
    
    
}
