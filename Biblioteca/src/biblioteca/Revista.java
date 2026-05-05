package biblioteca;

public class Revista extends Material {
    private int numedicion;

    // Constructor
    public Revista(String titulo, String autor, int anioPublicacion, int numedicion) 
            throws DatoInvalidoException {
        super(titulo, autor, anioPublicacion);
        this.numedicion = numedicion;
    }

    // Getters y Setters
    public int getNumedicion() {
        return numedicion;
    }

    public void setNumedicion(int numedicion) {
        this.numedicion = numedicion;
    }

    // Metodo prestar correcto
    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (isPrestado()) {
            throw new MaterialNoDisponibleException("La revista ya esta prestada");
        }
        setPrestado(true);
        System.out.println("Revista prestada correctamente");
    }
}