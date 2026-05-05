package biblioteca;


public class Principal {

    public static void main(String[] args) {

        try {
            Libro libro = new Libro("Java Básico", "Juan Pérez", 2020, 300);
            Revista revista = new Revista("Tech Today", "Ana López", 2022, 15);
            Tesis tesis = new Tesis("IA Moderna", "Carlos Ruiz", 2021, "UNAM");

            // LIBRO
            System.out.println("LIBRO");
            try {
                libro.prestar();
                libro.prestar();
            } catch (MaterialNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // REVISTA
            System.out.println("\nREVISTA");
            try {
                revista.prestar();
                revista.prestar();
            } catch (MaterialNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // TESIS
            System.out.println("\nTESIS");
            try {
                tesis.prestar();
                tesis.prestar();
            } catch (MaterialNoDisponibleException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } catch (DatoInvalidoException e) {
            System.out.println("Error al crear objeto: " + e.getMessage());
        }
    }
}