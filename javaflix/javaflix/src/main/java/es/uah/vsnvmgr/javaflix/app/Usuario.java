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
public class Usuario {
    
    private String dni;
    private String nombre;
    private String email;
    private String clave;
    private TarjetaCredito tarjetac;
    private boolean suscrito;
    
    /**
     *Constructor de la clase Usuario
     * @param dni String
     * @param nombre String
     * @param correo String
     * @param clave String
     * @param tarjeta TarjetaCredito
     * @param suscrito boolean
     */
    public Usuario (String dni, String nombre, String correo, String clave, TarjetaCredito tarjeta, boolean suscrito) {
        this.dni=dni;
        this.nombre=nombre;
        this.email=correo;
        this.clave=clave;
        this.tarjetac=tarjeta;
        this.suscrito=suscrito;
    }
    
    /**
     *Devuelve el DNI asociado al objeto.
     * @return String dni
     */
    public String getDni(){
        return dni;
    }

    /**
     *Settea el DNI del objeto.
     * @param dni String
     */
    public void setDni(String dni){
        this.dni=dni;
                }

    /**
     *Devuelve el nombre asociado al objeto.
     * @return String nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *Settea el nombre del objeto.
     * @param nombre String
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
                }

    /**
     *Devuelve el email asociado al objeto.
     * @return String email
     */
    public String getEmail(){
        return email;
    }

    /**
     *Settea el email del objeto.
     * @param email String
     */
    public void setEmail(String email){
        this.email=email;
                }

    /**
     *Devuelve la clave asociada al objeto.
     * @return String clave
     */
    public String getClave(){
        return clave;
    }

    /**
     *Settea la clave del objeto.
     * @param clave String
     */
    public void setClave(String clave){
        this.clave=clave;
                }

    /**
     *Devuelve la tarjeta de crédito asociada al objeto.
     * @return TarjetaCredito tarjetac
     */
    public TarjetaCredito getTarjetac(){
        return tarjetac;
    }

    /**
     *Settea la tarjeta de crédito del objeto.
     * @param tarjetac TarjetaCredito
     */
    public void setTarjetac(TarjetaCredito tarjetac){
        this.tarjetac=tarjetac;
                }

    /**
     *Devuelve si el usuario está o no suscrito.
     * @return boolean suscrito
     */
    public boolean getSuscrito(){
    return suscrito;
    }

    /**
     *Settea si el usuario está suscrito.
     * @param subscrito boolean
     */
    public void setSubscrito(boolean suscrito){
    this.suscrito=suscrito;
    }
    public String toString(){
    return dni+"-"+nombre+"-"+email+"-"+tarjetac.toString()+"-"+clave+"-"+suscrito;
    }
}