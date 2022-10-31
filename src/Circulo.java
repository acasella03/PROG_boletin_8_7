public class Circulo {
    private float radio;

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
}
