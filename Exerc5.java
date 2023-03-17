import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
            double raio=0.0;
            double area=0.0;
            double circunferencia=0.0;
            Scanner lerInput= new Scanner(System.in);
            System.out.println("Digite um valor para raio de um circulo: ");
            raio= lerInput.nextInt();
            CalculaArea(raio, area, circunferencia);
    }

    static void CalculaArea(double raio, double area, double circunferencia){
        area=Math.PI*Math.pow(raio, 2);
        circunferencia=2*Math.PI*raio;
        System.out.println("A area é "+area);
        System.out.println("A circunferencia é "+circunferencia);
    }



    }

