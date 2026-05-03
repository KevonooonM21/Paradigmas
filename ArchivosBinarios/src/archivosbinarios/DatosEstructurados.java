/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package archivosbinarios;
import java.io.*;

public class DatosEstructurados {
    public static void main(String[] args) {
        try {
            DataOutputStream salida = new DataOutputStream(new FileOutputStream("datos.bin"));
            salida.writeInt(25);
            salida.writeDouble(9.81);
            salida.writeUTF("Java");
            salida.close();

            DataInputStream entrada = new DataInputStream(new FileInputStream("datos.bin"));
            int entero = entrada.readInt();
            double decimal = entrada.readDouble();
            String texto = entrada.readUTF();
            entrada.close();

            System.out.println(entero);
            System.out.println(decimal);
            System.out.println(texto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}