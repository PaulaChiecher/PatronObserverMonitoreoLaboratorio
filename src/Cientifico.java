public class Cientifico implements Investigador {
    private String nombre;
    public Cientifico(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Se notifica a " + nombre + ": " + mensaje);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
