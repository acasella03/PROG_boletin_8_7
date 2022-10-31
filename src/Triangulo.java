public class Triangulo {
    private float base;
    private float altura;

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea(){
        return base*altura/2;
    }
}
