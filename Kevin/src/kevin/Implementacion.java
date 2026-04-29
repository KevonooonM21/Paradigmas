/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevin;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;

public class Implementacion {

    // 1.- ArithmeticException
    public void dividir() {
        int x = 10 / 0;
    }

    // 2.- NullPointerException
    public void textoNullo() {
        String texto = null;
        texto.length(); // aquí ocurre directamente
    }

    // 3.- ArrayIndexOutOfBoundsException
    public void verificarArreglo() {
        int[] arreglo = {1, 2, 3};
        int x = arreglo[5];
    }

    // 4.- FileNotFoundException
    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("archivo_inexistente.txt");
        new FileReader(archivo);
    }

    // 5.- IOException
    public void leerLinea() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));
        br.close(); // cerramos primero
        br.readLine(); // fuerza IOException
    }

    // 6.- InterruptedException
    public void esperar() throws InterruptedException {
        Thread.currentThread().interrupt();
        Thread.sleep(2000);
    }

    // 7.- SQLException
    public void conectarBD() throws SQLException {
        throw new SQLException("Error forzado de base de datos");
    }

    // 8.- OutOfMemoryError
    public void consumirMemoria() {
        try {
            int[] arreglo = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Error: La JVM se quedó sin memoria");
        }
    }

    // 9.- StackOverflowError
    public void ejecutarRecursion() {
        try {
            metodoRecursivo();
        } catch (StackOverflowError e) {
            System.out.println("Error: Desbordamiento de pila (StackOverflowError)");
        }
    }

    private void metodoRecursivo() {
        metodoRecursivo();
    }

    // 10.- IllegalArgumentException
    public void validarEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }

    // 11.- IllegalStateException
    public void verificarEstado(boolean estado) {
        if (!estado) {
            throw new IllegalStateException("El estado no es válido");
        }
    }

    // 12.- NumberFormatException
    public void convertirNumero(String numero) {
        int x = Integer.parseInt(numero);
    }

    // 13.- ClassNotFoundException
    public void cargarClase() throws ClassNotFoundException {
        Class.forName("clase.inexistente.Total");
    }

    // 14.- NoSuchMethodException
    public void invocarMetodo() throws NoSuchMethodException {
        try {
            Class<?> clase = String.class;
            clase.getMethod("metodoInexistente");
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodException("Método no encontrado forzado");
        }
    }

    // 15.- IllegalAccessException
    public void accederCampo() throws IllegalAccessException {
        try {
            Class<?> clase = System.class;
            java.lang.reflect.Field campo = clase.getDeclaredField("security");
            campo.setAccessible(false); // evitamos acceso
            campo.get(null); // provoca IllegalAccessException
        } catch (NoSuchFieldException e) {
            throw new IllegalAccessException("Acceso ilegal forzado");
        }
    }
}
