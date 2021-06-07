/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uah.vsnvmgr.javaflix.app;

/**
 *
 * @author MARCOSPC
 */
public class TarjetaCredito {
        
    private String numero;
    private int fecha;
    private double saldo;
    
    /**
     *Constructor de la clase TarjetaCredito
     * @param numero int
     * @param fecha String
     * @param saldo double
     */
    public TarjetaCredito (String numero, int fecha, double saldo) {
        this.numero=numero;
        this.fecha=fecha;
        this.saldo=saldo;
    
    }
    
    /**
     *Devuelve el número asociado a la tarjeta.
     * @return int numero
     */
    public String getNumero(){
        return numero;
    }

    /**
     *Settea el número de la tarjeta.
     * @param numero int
     */
    public void setNumero(String numero){
        this.numero=numero;
                }

    /**
     *Devuelve la fecha de caducidad asociada a un objeto tarjeta.
     * @return int fecha
     */
    public int getFecha(){
        return fecha;
    }

    /**
     *Settea la fecha de caducidad de la tarjeta.
     * @param fecha int
     */
    public void setfecha(int fecha){
        this.fecha=fecha;
                }

    /**
     *Devuelve el saldo asociado a la tarjeta.
     * @return double saldo
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     *Settea el saldo de la tarjeta de crédito.
     * @param saldo double
     */
    public void setsaldo(double saldo){
        this.saldo=saldo;
                }
    public String toString(){
    return numero+"-"+Integer.toString(fecha)+"-"+Double.toString(saldo);
    }
}

