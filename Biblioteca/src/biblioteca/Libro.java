package biblioteca;

public class Libro extends Material {
    private int numpaginas;

    // Constructor correcto
    public Libro(String titulo, String autor, int anioPublicacion, int numpaginas) 
            throws DatoInvalidoException {
        super(titulo, autor, anioPublicacion);
        this.numpaginas = numpaginas;
    }

    // Getters y Setters
    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    // Método prestar correcto
    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (isPrestado()) {
            throw new MaterialNoDisponibleException("El libro ya está prestado");
        }
        setPrestado(true);
        System.out.println("Libro prestado correctamente");
    }
}