package org.example;

import java.util.List;

public class CalculadoraDeAreas {
    public double calcularAreaTotal(List<Figura> figuras) {
        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.calcularArea();
        }
        return areaTotal;
    }
}