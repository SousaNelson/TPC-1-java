import java.util.Scanner;
public class ArmStrong {

    public static void main(String[] args) {
        Scanner lerInput = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = lerInput.nextInt();
        if (checkArmstrong(numero)) {
            System.out.println("O valor " + numero + " é Armstrong");
        } else {
            System.out.println(" O valor " + numero + " não é Armstrong");
        }
    }

    static boolean checkArmstrong(int numero) {
        int n = numero;
        int remainder;
        int resultado = 0;
        int n1 = 0;
        while (n != 0) {
            n /= 10;
            ++n1;
        }
        n = numero;
        while (n != 0) {

            remainder = n % 10;
            resultado += Math.pow(remainder, n1);
            n /= 10;
        }
        if (resultado == numero) {
            return true;

        }
        return false;
    }
}