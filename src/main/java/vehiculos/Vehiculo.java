package vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vehiculo {

	private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private double precio;
    private double peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos = 0;
    private static ArrayList<Vehiculo> vehiculos;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        cantidadVehiculos++;
        
        vehiculos.add(this);
        
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    
    static void setCantidadVehiculos(int cantidadVehiculo) {
        cantidadVehiculos = cantidadVehiculo ;
    }
    
    

    public static String vehiculosPorTipo() {
        int cantidadAutomoviles = 0;
        int cantidadCamionetas = 0;
        int cantidadCamiones = 0;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof Automovil) {
                cantidadAutomoviles++;
            } else if (vehiculo instanceof Camioneta) {
                cantidadCamionetas++;
            } else if (vehiculo instanceof Camion) {
                cantidadCamiones++;
            }
        }

        return "Automoviles: " + cantidadAutomoviles + "\nCamionetas: " + cantidadCamionetas + "\nCamiones: " + cantidadCamiones;
    }

    public static String paisMasVendedor() {
        Map<String, Integer> ventasPorPais = new HashMap<>();

        for (Vehiculo vehiculo : vehiculos) {
            String paisFabricante = vehiculo.getFabricante().getPais().getNombre();
            ventasPorPais.put(paisFabricante, ventasPorPais.getOrDefault(paisFabricante, 0) + 1);
        }

        String paisMasVendedor = "";
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }

        return paisMasVendedor;
    }

    public static String fabricaMayorVentas() {
        Map<String, Integer> ventasPorFabricante = new HashMap<>();

        for (Vehiculo vehiculo : vehiculos) {
            String nombreFabricante = vehiculo.getFabricante().getNombre();
            ventasPorFabricante.put(nombreFabricante, ventasPorFabricante.getOrDefault(nombreFabricante, 0) + 1);
        }

        String fabricaMayorVentas = "";
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                fabricaMayorVentas = entry.getKey();
            }
        }

        return fabricaMayorVentas;
    }
}
