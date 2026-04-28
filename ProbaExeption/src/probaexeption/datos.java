/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probaexeption;

/**
 *
 * @author webon
 */
public class datos {
    private int edad;

    public void validarEdad(int edad) throws MiExcepcion {
        if (edad < 18) {
            throw new MiExcepcion("Debes ser mayor de edad");
        }
        System.out.println("Edad valida");
    }
}
