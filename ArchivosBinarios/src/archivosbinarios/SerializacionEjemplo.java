/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivosbinarios;

import java.io.*;

class Estudiante implements Serializable {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class SerializacionEjemplo {
    public static void main(String[] args) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("estudiante.bin"));
            salida.writeObject(new Estudiante("Luis", 20));
            salida.close();

            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("estudiante.bin"));
            Estudiante e = (Estudiante) entrada.readObject();
            entrada.close();

            System.out.println(e.nombre + " - " + e.edad);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}