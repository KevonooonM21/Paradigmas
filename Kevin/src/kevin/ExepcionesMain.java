/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kevin;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ExepcionesMain {

    public static void main(String[] args) {
        
        Implementacion objeto = new Implementacion();

        // 1.- ArithmeticException
        try {
            objeto.dividir();
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }

        // 2.- NullPointerException
        try {
            objeto.textoNullo();
        } catch (NullPointerException e) {
            System.out.println("Error: se intentó acceder a un objeto nulo");
        }

        // 3.- ArrayIndexOutOfBoundsException
        try {
            objeto.verificarArreglo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El indice esta fuera de rango");
        }

        // 4.- FileNotFoundException
        try {
            objeto.leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no encontrado");
        }

        // 5.- IOException
        try {
            objeto.leerLinea();
        } catch (IOException e) {
            System.out.println("Error: ocurrio un error en la entrada/salida");
        }

        // 6.- InterruptedException         
        try {
            objeto.esperar();
        } catch (InterruptedException e) {
            System.out.println("Error: interrupcion del hilo");
        }

        // 7.- SQLException
        try {
            objeto.conectarBD();
        } catch (SQLException e) {
            System.out.println("Error en la base de datos: " + e.getMessage());
        }

        // 8.- OutOfMemoryError
        objeto.consumirMemoria();

        // 9.- StackOverflowError
        objeto.ejecutarRecursion();

        // 10.- IllegalArgumentException
        try {
            objeto.validarEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 11.- IllegalStateException
        try {
            objeto.verificarEstado(false); // ← corregido
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 12.- NumberFormatException
        objeto.convertirNumero("abc"); // ← ya se maneja dentro del método

        // 13.- ClassNotFoundException
        try {
            objeto.cargarClase(); // ← corregido
        } catch (ClassNotFoundException e) {
            System.out.println("Error: clase no encontrada");
        }   

        // 14.- NoSuchMethodException
        try {
            objeto.invocarMetodo(); // ← corregido
        } catch (NoSuchMethodException e) {
            System.out.println("Error: método no encontrado");
        }

        // 15.- IllegalAccessException
        try {
            objeto.accederCampo(); // ← corregido
        } catch (IllegalAccessException e) {
            System.out.println("Error: acceso ilegal a un método");
        }
    }
}
