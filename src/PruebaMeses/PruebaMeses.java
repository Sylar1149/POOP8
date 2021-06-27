/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaMeses;

/**
 *
 * @author Miguel Lozano
 */
public class PruebaMeses {
    public static void main(String[] args) {
        //Se puede acceder a las variables de la interfaz sin crear instancias
        System.out.println("El mes "+ Meses.DOS + " corresponde a:");
        System.out.println(Meses.NOMBRES_MESES[Meses.DOS]);
    }
}
