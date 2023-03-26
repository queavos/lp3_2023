/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ossva
 */
public class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("el perro  "+nombre+" esta ladrando" );
    }

    public Perro() {
    }

    public Perro(String colorPiel, String nombre) {
        super(colorPiel, nombre);
    }
    
    @Override
    public void comer() {
        super.comer();
        System.out.println("el perro  "+nombre+" esta comiendo" );
    }
}
