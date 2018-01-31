package redtaller;

import java.util.ArrayList;

public class Cliente {

    private String dni;
    private String nombre;
    private String telefono;
    private String fechaAlta;

    private ArrayList<Vehiculo> listaVehiculo;

    public Cliente(String dni, String nombre, String telefono, String fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaAlta = fechaAlta;

        this.listaVehiculo = new ArrayList<Vehiculo>();

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

    public void addVehiculo(Vehiculo vehiculo) {
        this.listaVehiculo.add(vehiculo);
        vehiculo.setCliente(this);
    }

    public void infoVehiculo() {
        System.out.println("Lista de vehiculos");
        for (int i = 0; i < this.listaVehiculo.size(); i++) {
            System.out.println("Matricula: "+ listaVehiculo.get(i).getMatricula());
        }
    }

}
