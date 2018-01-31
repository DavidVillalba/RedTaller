package redtaller;

import java.util.ArrayList;
import java.util.Scanner;

public class RedTaller {

    private ArrayList<Taller> listaTaller;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Vehiculo> listaVehiculo;

    private Scanner entrada = new Scanner(System.in);

    public RedTaller() {
        this.listaTaller = new ArrayList<Taller>();
        this.listaCliente = new ArrayList<Cliente>();
        this.listaVehiculo = new ArrayList<Vehiculo>();
    }

    public void addTaller(int codigo, String nombre, String direccion, String telefono) {
        int i;
        for (i = 0; i < listaTaller.size(); i++) {
            if (codigo == listaTaller.get(i).getCodigo()) {
                break;
            }
        }
        //El taller solo sera creado, si el entero tiene un valor mayor que el tamaño de la lista
        if (i < listaTaller.size()) {
            System.out.println("El taller" + nombre + " ya existe.");
        } else {

            listaTaller.add(new Taller(codigo, nombre, direccion, telefono));
        }
    }

    public void addCliente(String dni, String nombre, String telefono, String fechaAlta) {
        int i;
        for (i = 0; i < listaCliente.size(); i++) {
            if (dni.equals(listaCliente.get(i).getDni())) {
                break;
            }
        }
        //El cliente solo sera creado, si el entero tiene un valor mayor que el tama�o de la lista
        if (i < listaCliente.size()) {
            System.out.println("El cliente con el D.N.I. " + dni + " ya existe.");
        } else {

            listaCliente.add(new Cliente(dni, nombre, telefono, fechaAlta));
        }
    }

    public void addVehiculo(String matricula, String marca, String modelo, String color, int kilometraje) {
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

    public Taller getTaller(int codigo) {
        int i;
        for (i = 0; i < listaTaller.size(); i++) {
            if (codigo == (listaTaller.get(i).getCodigo())) {
                break;
            }
        }
        return listaTaller.get(i);
    }

    public String getInfoTaller(Taller taller) {
        String cadena = ("Codigo: " + taller.getCodigo() + "\nNombre: " + taller.getNombre() + "\nDirección: "
                + taller.getDireccion() + "\nTelefono: " + taller.getTelefono());
        return cadena;
    }

    public void consultarTaller() {
        System.out.print("Introducir codigo: ");
        int codigo = entrada.nextInt();
        System.out.println(getInfoTaller(getTaller(codigo)));
    }

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
        String cadena = ("DNI: " + cliente.getDni() + "\nNombre: " + cliente.getNombre() + "\nTelefono: "
                + cliente.getTelefono() + "\nFecha de alta: " + cliente.getFechaAlta());
        return cadena;
    }

    public void consultarCliente() {
        System.out.print("Introducir DNI: ");
        String dni = entrada.nextLine();
        System.out.println(getInfoCliente(getCliente(dni)));
    }

    public Vehiculo getVehiculo(String matricula) {
        int i;
        for (i = 0; i < listaVehiculo.size(); i++) {
            if (matricula.equals(listaVehiculo.get(i).getMatricula())) {
                break;
            }
        }
        return listaVehiculo.get(i);
    }

    public String getInfoVehiculo(Vehiculo vehiculo) {
        String cadena = ("Matricula: " + vehiculo.getMatricula() + "\nMarca: " + vehiculo.getMarca() + "\nModelo: "
                + vehiculo.getModelo() + "\nColor " + vehiculo.getColor() + "\nKilometraje: "
                + vehiculo.getKilometraje());
        return cadena;
    }

    public void consultarVehiculo() {
        System.out.print("Introducir matricula: ");
        String matricula = entrada.nextLine();
        System.out.println(getInfoVehiculo(getVehiculo(matricula)));
    }

    public void reportCliente(Cliente c) {
        System.out.println("DNI: " + c.getDni());
        c.infoVehiculo();
    }

    public void generarDatosIniciales() {
        //Crear Taller
        addTaller(001, "Paco", "Calle Pepo", "4654654");
        addTaller(002, "Gilberto", "Calle Pancracio", "56416465");

        //Crear Cliente
        addCliente("65465P", "Roberto", "685-445-654", "12/05/2013");
        addCliente("56546L", "Juan", "684-464-448", "01/12/2017");

        //Crear Vehiculos
        addVehiculo("1585 FGH", "Tesla", "Model S", "Rojo", 40000);
        addVehiculo("65464", "asfa", "wadw", "dwa", 54654);

        Cliente cliente1 = new Cliente("65465P", "Roberto", "685-445-654", "12/05/2013");
        Vehiculo vehiculo1 = new Vehiculo("1585 FGH", "Tesla", "Model S", "Rojo", 40000);

        cliente1.addVehiculo(vehiculo1);

        reportCliente(cliente1);


    }

    public void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("1. Opcion 1");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Opcion 4");
        System.out.println("5. Salir");

        System.out.print("Escribe una de las opciones: ");
        opcion = sc.nextInt();

        switch (opcion) {
        case 1:
            System.out.println("1. Opcion 1");
            consultarCliente();
            break;
        case 2:
            System.out.println("2. Opcion 2");
            consultarVehiculo();
            break;
        case 3:
            System.out.println("3. Opcion 3");
            consultarTaller();
            break;
        case 4:
            System.out.println("4. Opcion 4");
            break;
        }
        sc.close();
    }

    public static void main(String[] args) {

        RedTaller red = new RedTaller();

        red.generarDatosIniciales();
        red.menuPrincipal();

        System.out.println();

    }

}