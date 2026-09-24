/**
 * Gestiona operaciones básicas relacionadas con las notas de un estudiante.
 */
public class CalculadoraNotas {
    /**
     * Calcula el promedio de tres evaluaciones.
     *
     * @param nota1 primera nota
     * @param nota2 segunda nota
     * @param nota3 tercera nota
     * @return promedio de las tres notas
     */
    public double calcularPromedio(double nota1, double nota2, double nota3){
        //Las tres evaluaciones tienen la misma ponderacion.
        return (nota1+nota2+nota3) /3.0;
    }

    /**
     * Determina si el promedio permite aprobar.
     *
     * @param promedio nota promedio obtenida por el estudiante
     * @return true si el promedio es igual o superior a 4.0
     */
    public boolean estaAprobado(double promedio){
        /*
         *La nota mínima de aprobacion exigida por la institucion corresponde a 4.0
         */
        return promedio >= 4.0;
    }
}