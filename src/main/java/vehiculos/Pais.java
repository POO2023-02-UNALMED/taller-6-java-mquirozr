package vehiculos;

import java.util.HashMap;
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
    
}
