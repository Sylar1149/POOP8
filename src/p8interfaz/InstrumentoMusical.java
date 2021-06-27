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
public interface InstrumentoMusical {
    
    /*Por defecto todos los métodos definitivos dentro
    de una interfaz son publicos y abstractos*/
    
    void tocar();
    
    void afinar();
    
    String tipoInstrumento();
    
}
