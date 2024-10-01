package Estudiante;

public class Estudiante {

    private String nombreCompleto;
    private double[] notas;


    public Estudiante(String nombreCompleto, double[] notas) {
        this.nombreCompleto = nombreCompleto;
        if (notas.length != 5) {
            throw new IllegalArgumentException("Se requieren exactamente 5 notas.");
        }
        this.notas = notas;
    }

    // Use este metodo para calcular el promedio
    public double calcularPromedio() {
        double total = 0;
        for (double nota : notas) {
            total += nota;
        }
        return total / notas.length;
    }

    // Este metodo es para la calificacion final
    public char determinarCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else if (promedio <= 100) {
            return 'A';
        } else {
            throw new IllegalArgumentException("El promedio no puede exceder 100.");
        }
    }

    // Método para mostrar los resultados
    public void mostrarResultados(double promedio, char calificacionFinal) {
        System.out.println("Nombre del estudiante: " + nombreCompleto);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
}
