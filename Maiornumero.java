import java.util.Scanner;
public class Maiornumero {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner lerInput = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        n1 = lerInput.nextInt();
        System.out.println("Digite o segundo numero");
        n2 = lerInput.nextInt();
        System.out.println("Digite o terceiro numero");
        n3 = lerInput.nextInt();

        int maior = maiornumero(n1, n2, n3);
        if (maior == 0) {
            System.out.println("Os numeros não são distintos");
        } else {
            System.out.println("O maior numero é " + maior);

        }
    }

    static int maiornumero(int n1, int n2, int n3) {
        int maior = 0;

        if (n1 != n2 && n2 != n3 && n1 != n3) {

            if (n1 > n2 && n1 > n3) {
                maior = n1;
            }
            if (n2 > n1 && n2 > n3) {
                maior = n2;
            }
            if (n3 > n2 && n3 > n1) {
                maior = n3;
            }

        }
        return maior;
    }
}