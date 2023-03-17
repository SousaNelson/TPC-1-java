import java.util.Scanner;
public class Main {
    public static double converter(double tempF) {
        return 9 * tempF / 5 + 32;
    }
    public static void main(String[] args){
        Scanner lerInput= new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius= lerInput.nextInt();
        System.out.println("O valor em Farenheit é: ");

        System.out.println(converter(celsius));
    }
}