/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probaexeption;

/**
 *
 * @author webon
 */
public class MiExcepcion extends Exception{
    
    public MiExcepcion(String mensaje) {
        // Super("mensaje de error por el usuario")
        super(mensaje);
    }
}
