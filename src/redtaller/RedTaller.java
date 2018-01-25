package redtaller;

import java.util.Scanner;

public class RedTaller {

    /*public void crearCliente() {//905
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
    }*/
    public String getConsultaCliente(Cliente cliente) {
        String cadena = ("DNI: " + cliente.getDni()
                + "\nNombre: " + cliente.getNombre()
                + "\nTelefono: " + cliente.getTelefono()
                + "\nFecha de alta: " + cliente.getFechaAlta());
        return cadena;
    }

    /*public void consultarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir DNI: ");
        String dni = scanner.nextLine();
        System.out.println(getConsultaCliente(cliente));
    }*/

 /*public void crearVehiculo() {
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
    }*/
 /*public String getConsultaVehiculo(Vehiculo vehiculo) {
        String cadena = ("Matricula: " + vehiculo.getMatricula()
                + "\nMarca: " + vehiculo.getMarca()
                + "\nModelo: " + vehiculo.getModelo()
                + "\nColor: " + vehiculo.getColor()
                + "\nKilometros: " + vehiculo.getKilometraje());
        return cadena;
    }*/

 /*public void consultarVehiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir matricula: ");
        String matricula = scanner.nextLine();
        System.out.println(getConsultaVehiculo(cliente.getVehiculo(matricula)));
        System.out.println(getConsultaCliente(cliente));
    }*/
    public void generarDatosIniciales() {

        //Crear taller
        Taller taller01 = new Taller(001, "Isma", "Calle Ronda Allenyà, 19", "976356685");

        //Crear Cliente
        Cliente cliente01 = new Cliente("29573493P", "Roberto", "685155468", "12/05/2013");
        
        //Crear Vehiculos
        Vehiculo coche01 = new Vehiculo("Rojo", "1585 FGH", "Tesla", "Model S", "40000");
    }

    public static void main(String[] args) {

        RedTaller gestionador = new RedTaller();
        gestionador.generarDatosIniciales();
        //gestionador.crearCliente();
        //gestionador.crearVehiculo();
        //gestionador.consultarCliente();
        //gestionador.consultarVehiculo();

    }

}
