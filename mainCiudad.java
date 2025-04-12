package Predicate.Ejercicio11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class mainCiudad {
    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Madrid", 3200000));
        ciudades.add(new Ciudad("Barcelona", 1600000));
        ciudades.add(new Ciudad("Valencia", 800000));
        ciudades.add(new Ciudad("Sevilla", 690000));
        ciudades.add(new Ciudad("Zaragoza", 675000));
        ciudades.add(new Ciudad("Málaga", 580000));
        ciudades.add(new Ciudad("Murcia", 450000));
        ciudades.add(new Ciudad("Elche", 230000));
        ciudades.add(new Ciudad("Eibar", 27000));
        ciudades.add(new Ciudad("Esplugues", 110000));

        Predicate<Ciudad> filtro = c -> c.getNombre().startsWith("E") && c.getHabitantes() > 100000;

        imprimirCiudades(ciudades, filtro);
    }

    public static void imprimirCiudades(List<Ciudad> lista, Predicate<Ciudad> filtro) {
        for (Ciudad ciudad : lista) {
            if (filtro.test(ciudad)) {
                System.out.println(ciudad);
            }
        }
    }
}

