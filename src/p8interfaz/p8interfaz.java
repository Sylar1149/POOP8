/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8interfaz;

/**
 *
 * @author Miguel Lozano
 */
public class p8interfaz {
    public static void main(String[] args) {
        //Se puede crear una referencia de interfaz
        InstrumentoMusical instrumento;
        /*Pero no es posible crear una instancia de una interfaz
        instrumento = new InstrumentoMusical();
        
        Una referencia a interfaz puede ser asignada
        a cualquier objeto que la implemente*/
        
        instrumento = new InstrumentoViento();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
        instrumento = new Flauta();
        System.out.println(instrumento.tipoInstrumento());
    }
    
}
