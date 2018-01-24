package redtaller;

import java.util.ArrayList;

public class RedTaller {

    Taller taller01 = new Taller();
    private ArrayList<Taller> listaTaller;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Vehiculo> listavehiculo;

    public RedTaller

    {
        listaTaller = new ArrayList<Taller>();
        listaCliente = new ArrayList<Cliente>();
        listavehiculo = new ArrayList<Vehiculo>();
    }

    public static void main(String[] args) {

        //Crear Cliente
        Cliente cliente01 = new Cliente("45246844L", "Pancracio", 666485483);
        Cliente cliente02 = new Cliente("29573493P", "Roberto", 685155468);

        //Crear Vehiculos
        Vehiculo coche01 = new Vehiculo("Rojo", "1585 FGH", "Tesla", "Model S", 40000);
        Vehiculo coche02 = new Vehiculo("Negro", "4832 DSE", "Lexus", "CT 2011", 150000);
    }

}
