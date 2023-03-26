/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ossva
 */
public class Mamifero extends Animal {
    protected String colorPiel;

    public Mamifero() {
    }

    public Mamifero(String colorPiel, String nombre) {
        super(nombre);
        this.colorPiel = colorPiel;
    }
    
    public void amamantar() {
        System.out.println("el mamifero  "+nombre+" esta amamantando" );
    }
}
