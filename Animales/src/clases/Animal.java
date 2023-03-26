/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ossva
 */
public class Animal {
    protected String especie;
    protected String nombre;

    public Animal() {
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void comer() {
        System.out.println("el animal  "+nombre+" esta comiendo" );
    }
    public void moverse() {
        System.out.println("el animal  "+nombre+" esta moviendose" );
    }
}
