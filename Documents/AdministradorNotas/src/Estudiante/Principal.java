package Estudiante;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Aqui se solicita el nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = entrada.nextLine();

        // Se solicitan las cinco notas
        double[] notas = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
        }

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante(nombre, notas);

        // Calcular el promedio
        double promedio = estudiante.calcularPromedio();

        // Determinar la calificación final
        char calificacionFinal = estudiante.determinarCalificacion(promedio);

        // Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        estudiante.mostrarResultados(promedio, calificacionFinal);

        entrada.close();
    }
}
