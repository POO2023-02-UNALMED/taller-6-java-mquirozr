

package vehiculos;

import vehiculos.Vehiculo;
import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private static Map<String, Integer> ventas = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarVenta() {
        ventas.put(nombre, ventas.getOrDefault(nombre, 0) + 1);
    }
    
    
    public static String paisMasVendedor() {
        int maxVentas = 0;
        String paisMasVendedor = "";

        for (Map.Entry<String, Integer> entry : ventas.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
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