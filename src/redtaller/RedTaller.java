package redtaller;

import java.util.ArrayList;
import java.util.Scanner;

public class RedTaller {

    private ArrayList<Cliente> listaCliente;
    private ArrayList<Vehiculo> listaVehiculo;

    static Scanner entrada = new Scanner(System.in);

    public RedTaller() {
        listaCliente = new ArrayList<Cliente>();
        listaVehiculo = new ArrayList<Vehiculo>();
    }

    public void addCliente(String dni, String nombre, String telefono, String fechaAlta) {
        int i;
        for (i = 0; i < listaCliente.size(); i++) {
            if (dni.equals(listaCliente.get(i).getDni())) {
                break;
            }
        }
        //El cliente solo sera creado, si el entero tiene un valor mayor que el tamaño de la lista
        if (i < listaCliente.size()) {
            System.out.println("El cliente con el D.N.I. " + dni + " ya existe.");
        } else {
            
            listaCliente.add(new Cliente(dni, nombre, telefono, fechaAlta));
        }
    }

    /*public void crearCliente() {//905
        String dni, nombre, telefono, fechaAlta;
        System.out.print("DNI: ");
        dni = entrada.nextLine();
        System.out.print("Nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Telefono: ");
        telefono = entrada.nextLine();
        System.out.print("Fecha: ");
        fechaAlta = entrada.nextLine();
        addCliente(dni, nombre, telefono, fechaAlta);
    }*/

    public Cliente getCliente(String dni) {
        int i;
        for (i = 0; i < listaCliente.size(); i++) {
            if (dni.equals(listaCliente.get(i).getDni())) {
                break;
            }
        }
        return listaCliente.get(i);
    }

    public String getInfoCliente(Cliente cliente) {
        String cadena = ("DNI: " + cliente.getDni()
                + "\nNombre: " + cliente.getNombre()
                + "\nTelefono: " + cliente.getTelefono()
                + "\nFecha de alta: " + cliente.getFechaAlta());
        return cadena;
    }

    public void infoCliente() {
        System.out.print("Introducir DNI: ");
        String dni = entrada.nextLine();
        System.out.println(getInfoCliente(getCliente(dni)));
    }

    public void addVehiculo(String matricula, String marca, String modelo, String color, String kilometraje) {
        int i;
        for (i = 0; i < listaVehiculo.size(); i++) {
            if (matricula.equals(listaVehiculo.get(i).getMatricula())) {
                break;
            }
        }
        if (i < listaVehiculo.size()) {
            System.out.println("El vehiculo con la matricula " + matricula + " ya existe.");
        } else {
            listaVehiculo.add(new Vehiculo(matricula, marca, modelo, color, kilometraje));
        }
    }

   /* public void crearVehiculo() {
        String matricula, marca, modelo, color, kilometraje;
        System.out.print("Matricula: ");
        matricula = entrada.nextLine();
        System.out.print("Marca: ");
        marca = entrada.nextLine();
        System.out.print("Modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Color: ");
        color = entrada.nextLine();
        System.out.print("Kilometraje: ");
        kilometraje = entrada.nextLine();
        addVehiculo(matricula, marca, modelo, color, kilometraje);
    }*/

    public Vehiculo getVehiculo(String matricula) {
        int i;
        for (i = 0; i < listaVehiculo.size(); i++) {
            if (matricula.equals(listaVehiculo.get(i).getMatricula())) {
                break;
            }
        }
        return listaVehiculo.get(i);
    }

    public String getConsultaVehiculo(Vehiculo vehiculo) {
        String cadena = ("Matricula: " + vehiculo.getMatricula()
                + "\nMarca: " + vehiculo.getMarca()
                + "\nModelo: " + vehiculo.getModelo()
                + "\nColor: " + vehiculo.getColor()
                + "\nKilometros: " + vehiculo.getKilometraje());
        return cadena;
    }

    public void consultarVehiculo() {
        System.out.print("Introducir matricula: ");
        String matricula = entrada.nextLine();
        System.out.println(getConsultaVehiculo(getVehiculo(matricula)));
    }

    public void generarDatosIniciales() {

        //Crear taller
        //Taller taller01 = new Taller(001, "Isma", "Calle Ronda Allenyà, 19", "976356685");
        //Crear Cliente
        addCliente("29573493P", "Roberto", "685155468", "12/05/2013");
        addCliente("12","fsdf","df","daf");

        //Crear Vehiculos
        addVehiculo("1585 FGH", "Tesla", "Model S", "Rojo", "40000");
        addVehiculo("45","sad","asd","asd","545");
    }

    public static void main(String[] args) {
        

        RedTaller gestionador = new RedTaller();
        gestionador.generarDatosIniciales();
        //gestionador.crearCliente();
        //gestionador.crearVehiculo();
        gestionador.infoCliente();
        //gestionador.consultarVehiculo();
        
        

    }

}
