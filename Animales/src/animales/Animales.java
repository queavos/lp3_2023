/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import clases.Perro;

/**
 *
 * @author ossva
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Perro p = new Perro("Marron", "Marco");
       p.comer();
       p.moverse();
       p.amamantar();
       p.ladrar();
    }
    
}
