package redtaller;

import java.util.Scanner;

public class RedTaller {

    private Taller taller01 = new Taller(001, "Isma", "Calle Ronda Allenyà, 19", "976356685");

    public void crearCliente() {//905
        String dni, nombre, telefono;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir DNI: ");
        dni = scanner.nextLine();
        System.out.print("Introducir Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introducir Telefono: ");
        telefono = scanner.nextLine();

        taller01.addCliente(dni, nombre, telefono);
    }

    public void generarDatosIniciales() {
        this.taller01.addCliente("45246844L", "Pancracio", "666485483");
        this.taller01.addCliente("29573493P", "Roberto", "685155468");
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
        gestionador.generarDatosIniciales();
        gestionador.crearCliente();
        
    }

}
