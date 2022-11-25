/**
 * Clase Cuadrado.
 *
 * @author Angi M. Casella
 * @version 25.11.2022
 */
public class Cuadrado {
    /**
     * Lado del cuadrado
     */
    private float lado;

    /**
     * Constructor por defecto
     */
    public Cuadrado() {
    }

    /**
     * Retorna el valor de lado del cuadrado
     *
     * @return el lado del cuadrado
     */
    public float getLado() {
        return lado;
    }

    /**
     * Da valor al lado del cuadrado
     *
     * @param lado del cuadrado
     */
    public void setLado(float lado) {
        this.lado = lado;
    }

    /**
     * Metodo que calcula el area del cuadrado
     *
     * @return el area del cuadrado
     */
    public float calcularArea() {
        float area = lado * lado;
        return area;
    }
}
