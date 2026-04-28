/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probaexeption;

/**
 *
 * @author webon
 */
public class ProbaExeption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Error basico de artimetica. Operacion invalida
        try {
            int resultado = 10 / 0; // Esto lanzará una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Objeto no inicializado. NullPointerException
        try {
            String texto = null;
            System.out.println(texto.length()); // Esto lanzara una NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error de tamaño del objeto.");
        }

        // Posicion invalida de un arreglo
        try {
            int[] num = {1, 2, 3, 4};
            System.out.println(num[5]); // Esto lanzara una ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de rango.");
        }

        // Uso multiples catch
        try {
            int[] numeros = new int[3];
            int resultado = 10 / 0; // Esto lanzara una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indice fuera de rango.");
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }

        datos d = new datos();
        try {
            d.validarEdad(6);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

}
