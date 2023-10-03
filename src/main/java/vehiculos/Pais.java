

package vehiculos;

import vehiculos.Vehiculo;
import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static Map<Vehiculo, Integer> ventas = new HashMap<>(); // Atributo estático para registrar las ventas

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para registrar una venta de un vehículo en el país
    public void registrarVenta(Vehiculo vehiculo) {
        ventas.put(vehiculo, ventas.getOrDefault(vehiculo, 0) + 1);
    }

    // Método para obtener el país que más vehículos ha vendido
    public static String paisMasVendedor() {
        int maxVentas = 0;
        String paisMasVendedor = "";

        for (Map.Entry<Vehiculo, Integer> entry : ventas.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey().getFabricante().getPais().getNombre();
            }
        }

        return paisMasVendedor;
    }
}


/*package vehiculos;

import java.util.HashMap;
import java.util.List;

import vehiculos.Vehiculo;
import java.util.Map;

public class Pais {

	private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
*/