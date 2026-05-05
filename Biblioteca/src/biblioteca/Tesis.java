package biblioteca;

public class Tesis extends Material {
    private String universidad;

    // Constructor correcto
    public Tesis(String titulo, String autor, int anioPublicacion, String universidad) 
            throws DatoInvalidoException {
        super(titulo, autor, anioPublicacion);
        this.universidad = universidad;
    }

    // Getters y Setters
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    // Método prestar correcto
    @Override
    public void prestar() throws MaterialNoDisponibleException {
        if (isPrestado()) {
            throw new MaterialNoDisponibleException("La tesis ya está prestada");
        }
        setPrestado(true);
        System.out.println("Tesis prestada correctamente");
    }
}