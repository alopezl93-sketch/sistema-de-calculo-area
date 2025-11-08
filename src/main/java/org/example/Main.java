package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear diferentes figuras
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Triangulo triangulo = new Triangulo(3, 8);

        // Crear lista de figuras
        List<Figura> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(triangulo);

        // Calcular área total
        CalculadoraDeAreas calculadora = new CalculadoraDeAreas();
        double areaTotal = calculadora.calcularAreaTotal(figuras);

        // Mostrar resultados
        System.out.println("=== SISTEMA DE CÁLCULO DE ÁREAS ===\n");
        System.out.println("Círculo (radio=" + circulo.getRadio() + "): " +
                String.format("%.2f", circulo.calcularArea()));
        System.out.println("Rectángulo (base=" + rectangulo.getBase() +
                ", altura=" + rectangulo.getAltura() + "): " +
                String.format("%.2f", rectangulo.calcularArea()));
        System.out.println("Triángulo (base=" + triangulo.getBase() +
                ", altura=" + triangulo.getAltura() + "): " +
                String.format("%.2f", triangulo.calcularArea()));
        System.out.println("\nÁrea Total: " + String.format("%.2f", areaTotal));

        // Demostrar extensibilidad (OCP)
        System.out.println("\n=== AGREGANDO NUEVAS FIGURAS ===");
        figuras.add(new Circulo(3));
        figuras.add(new Rectangulo(5, 5));

        double nuevoAreaTotal = calculadora.calcularAreaTotal(figuras);
        System.out.println("Nuevo Área Total: " + String.format("%.2f", nuevoAreaTotal));
    }
}