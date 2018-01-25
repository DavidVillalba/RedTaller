package redtaller;

import com.sun.security.ntlm.Client;
import java.util.Scanner;

public class RedTaller {

    private Taller taller01 = new Taller(001, "Isma", "Calle Ronda Allenyà, 19", "976356685");

    private Cliente cliente01 = new Cliente("29573493P", "Roberto", "685155468", "15/06/2017");
    

    public void crearCliente() {//905
        String dni, nombre, telefono, fechaAlta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir DNI: ");
        dni = scanner.nextLine();
        System.out.print("Introducir Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introducir Telefono: ");
        telefono = scanner.nextLine();
        System.out.print("Introducir la Fecha: ");
        fechaAlta = scanner.nextLine();

        taller01.addCliente(dni, nombre, telefono, fechaAlta);
    }

    public String getConsultaCliente(Cliente cliente) {
        String cadena = ("DNI: " + cliente.getDni()
                + "\nNombre: " + cliente.getNombre()
                + "\nTelefono: " + cliente.getTelefono()
                + "\nFecha de alta: " + cliente.getFechaAlta());
        return cadena;
    }

    public void consultarCliente() {//964
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir DNI: ");
        String dni = scanner.nextLine();
        System.out.println(getConsultaCliente(taller01.getCliente(dni)));
    }

    public void crearVehiculo() {
        String matricula, marca, modelo, color;
        String kilometraje;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir Matricula: ");
        matricula = scanner.nextLine();
        System.out.print("Introducir marca: ");
        marca = scanner.nextLine();
        System.out.print("Introducir modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Introducir color: ");
        color = scanner.nextLine();
        System.out.print("Introducir Kilometraje: ");
        kilometraje = scanner.nextLine();
        
        cliente01.addVehiculo(color, matricula, marca, modelo, kilometraje);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir matricula: ");
        String matricula = scanner.nextLine();
        System.out.println(getConsultaVehiculo(cliente01.getVehiculo(matricula)));
        System.out.println(getConsultaCliente(cliente01));
    }

    public void generarDatosIniciales() {
        //this.taller01.addCliente("45246844L", "Pancracio", "666485483", "24/12/2008");
        //this.taller01.addCliente("29573493P", "Roberto", "685155468", "15/06/2017");

        //this.cliente01.addVehiculo("Rojo", "1585 FGH", "Tesla", "Model S", 40000);
        //this.cliente02.addVehiculo("Negro", "4832 DSE", "Lexus", "CT 2011", 150000);
    }

    public static void main(String[] args) {

        //Crear taller
        /*Taller taller01 = new Taller(001, "Isma", "Calle Ronda Allenyà, 19", "976356685");
        Taller taller02 = new Taller(002, "Ach", "Calle Nos, 124", "975265869");

        //Crear Cliente
        Cliente cliente01 = new Cliente("45246844L", "Pancracio", "666485483");
        Cliente cliente02 = new Cliente("29573493P", "Roberto", "685155468");

        //Crear Vehiculos
        Vehiculo coche01 = new Vehiculo("Rojo", "1585 FGH", "Tesla", "Model S", 40000);
        Vehiculo coche02 = new Vehiculo("Negro", "4832 DSE", "Lexus", "CT 2011", 150000);*/
        RedTaller gestionador = new RedTaller();
        //gestionador.generarDatosIniciales();
        gestionador.crearCliente();
        gestionador.crearVehiculo();
        //gestionador.consultarCliente();
        gestionador.consultarVehiculo();

    }

}
