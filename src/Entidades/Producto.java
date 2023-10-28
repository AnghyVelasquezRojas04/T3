/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


/**
 *
 * @author anghy
 */
public class Producto {
    
    private String nombre;
    private int costo;
    private String talla;

    

    public Producto(String nombre, int costo, String talla) {
        this.nombre = nombre;
        this.costo = costo;
        this.talla = talla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
 
    
    public String getTexto(){
        return " Nombre: " + this.nombre
                + " Costo: " + this.costo
                + " Talla: " + this.talla;
    }
    
}
