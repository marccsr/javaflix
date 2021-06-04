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
public class Usuario {
    
    private String dni;
    private String nombre;
    private String correo;
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
        this.correo=correo;
        this.clave=clave;
        this.tarjetac=tarjeta;
        this.suscrito=suscrito;
    }
    
    /**
     *Devuelve el DNI asociado al objeto
     * @return String dni
     */
    public String getDni(){
        return dni;
    }

    /**
     *Permite indicar el Dni de un objeto Usuario
     * @param dni String
     */
    public void setDni(String dni){
        this.dni=dni;
                }

    /**
     *Devuelve el nombre asociado al objeto
     * @return String nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *Permite indicar el nombre de un objeto Usuario
     * @param nombre String
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
                }

    /**
     *Devuelve el correo asociado al objeto
     * @return String correo
     */
    public String getCorreo(){
        return correo;
    }

    /**
     *Permite indicar el correo de un objeto Usuario
     * @param correo String
     */
    public void setCorreo(String correo){
        this.correo=correo;
                }

    /**
     *Devuelve la clave asociada al objeto
     * @return String clave
     */
    public String getClave(){
        return clave;
    }

    /**
     *Permite indicar la clave de un objeto Usuario
     * @param clave String
     */
    public void setClave(String clave){
        this.clave=clave;
                }

    /**
     *Devuelve la tarjetac asociada al objeto Usuario
     * @return TarjetaCredito tarjetac
     */
    public TarjetaCredito getTarjetac(){
        return tarjetac;
    }

    /**
     *Permite indicar la tarjetac de un objeto Usuario
     * @param tarjetac TarjetaCredito
     */
    public void setTarjetac(TarjetaCredito tarjetac){
        this.tarjetac=tarjetac;
                }

    /**
     *Devuelve si el objeto está o no suscrito
     * @return boolean suscrito
     */
    public boolean getSuscrito(){
    return suscrito;
    }

    /**
     *Permite indicar si el objeto está suscrito
     * @param subscrito boolean
     */
    public void setSubscrito(boolean suscrito){
    this.suscrito=suscrito;
    }
    public String toString(){
    return dni+"-"+nombre+"-"+correo+"-"+tarjetac.toString()+"-"+clave+"-"+suscrito;
    }
}
