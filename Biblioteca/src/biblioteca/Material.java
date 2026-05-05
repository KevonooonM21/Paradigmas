package biblioteca;

public abstract class Material {
    protected String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    // Constructor
    public Material(String titulo, String autor, int anioPublicacion) throws DatoInvalidoException {
        if (anioPublicacion < 0 || anioPublicacion > 2026) {
            throw new DatoInvalidoException("El año de publicación no es válido");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    // Método abstracto con excepción
    public abstract void prestar() throws MaterialNoDisponibleException;
}