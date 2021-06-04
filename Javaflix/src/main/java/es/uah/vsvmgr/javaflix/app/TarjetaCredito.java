package es.uah.vsvmgr.javaflix.app;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcostuf
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
     *Devuelve el número asociado a un objeto tarjeta que tendrá 16 dígitos
     * @return int numero
     */
    public String getNumero(){
        return numero;
    }

    /**
     *Permite indicar el número de un objeto tarjeta que tendrá 16 dígitos
     * @param numero int
     */
    public void setNumero(String numero){
        this.numero=numero;
                }

    /**
     *Devuelve la fecha de caducidad asociada a un objeto tarjeta con estructura XXXX siendo los dos primeros dígitos el mes y los dos finales el año, el primer dígito es opcional en el caso de ser un mes de un solo dígito.
     * @return int fecha
     */
    public int getFecha(){
        return fecha;
    }

    /**
     *Permite indicar la fecha de caducidad de un objeto tarjeta con estructura XXXX siendo los dos primeros digitos el mes y los dos finales el año, el primer dígito es opcional en el caso de ser un mes de un solo dígito.
     * @param fecha int
     */
    public void setfecha(int fecha){
        this.fecha=fecha;
                }

    /**
     *Devuelve el saldo asociado a la tarjeta del objeto
     * @return double saldo
     */
    public double getSaldo(){
        return saldo;
    }

    /**
     *Permite indicar el saldo de la tarjeta de crédito
     * @param saldo double
     */
    public void setsaldo(double saldo){
        this.saldo=saldo;
                }
    public String toString(){
    return numero+"-"+Integer.toString(fecha)+"-"+Double.toString(saldo);
    }
}
