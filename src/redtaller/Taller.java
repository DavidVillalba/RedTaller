package redtaller;

import java.util.ArrayList;

public class Taller {

    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;

    private ArrayList<Cliente> listaCliente;
    private ArrayList<Vehiculo> listavehiculo;

    Taller(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        listaCliente = new ArrayList<Cliente>();
        listavehiculo = new ArrayList<Vehiculo>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void addCliente(String dni, String nombre, String telefono) {//68

        listaCliente.add(new Cliente(dni, nombre, telefono));

    }

}
