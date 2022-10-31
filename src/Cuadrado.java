public class Cuadrado {
    private float lado;

    public Cuadrado(){

    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularArea(){
        float area=lado*lado;
        return area;
    }
}
