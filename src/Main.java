import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Elige una figura geométrica");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");

        Scanner scaner=new Scanner (System.in);
        int figura= scaner.nextInt();

        switch (figura){
            case 1:
                System.out.println("Introduce el lado");
                float lado=scaner.nextFloat();
                Cuadrado cuadrado1=new Cuadrado();
                cuadrado1.setLado(lado);
                System.out.println("El area del cuadrado es: "+cuadrado1.calcularArea());
                break;
            case 2:
                System.out.println("Introduce la base");
                float base=scaner.nextFloat();
                System.out.println("Introduce la altura");
                float altura=scaner.nextFloat();
                Triangulo triangulo1=new Triangulo();
                triangulo1.setBase(base);
                triangulo1.setAltura(altura);
                System.out.println("El area del triángulo es: "+triangulo1.calcularArea());
                break;
            case 3:
                System.out.println("Introduce el radio");
                float radio=scaner.nextFloat();
                Circulo circulo1=new Circulo();
                circulo1.setRadio(radio);
                System.out.println("El area del círculo es: "+circulo1.calcularArea());
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}