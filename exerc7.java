import java.util.Scanner;
public class exerc7 {
    public static void main(String[] args) {
        double SalarioAumentado;
        double salary = readDouble("Por favor, insira seu salário: ");
        double percentageRaise = readDouble("Qual a percentagem do aumento?");
        SalarioAumentado=salary+(salary*percentageRaise)/100;
        System.out.println("O Salario Aumentado é "+SalarioAumentado);
    }
    static double readDouble(String prompt){
        Scanner lerdouble = new Scanner(System.in);
        System.out.println(prompt);
        return lerdouble.nextDouble();
    }
}

