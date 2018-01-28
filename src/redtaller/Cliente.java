package redtaller;

public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;
    private String fechaAlta;

    public Cliente(String dni, String nombre, String telefono, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaAlta() {
        return this.fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
