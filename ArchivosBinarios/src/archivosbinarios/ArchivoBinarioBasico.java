


package archivosbinarios;


import java.io.*;

public class ArchivoBinarioBasico {
    public static void main(String[] args) {
        try {
            FileOutputStream salida = new FileOutputStream("archivo.bin");
            salida.write(72); // H
            salida.write(111); // o
            salida.close();

            FileInputStream entrada = new FileInputStream("archivo.bin");
            int dato;
            while ((dato = entrada.read()) != -1) {
                System.out.print((char) dato);
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
