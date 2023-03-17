import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        int numcrianças, Grupo, numGrupos, semgrupo;
        Scanner lerInput= new Scanner(System.in);
        System.out.println("Digite a quantidade de crianças: ");
        numcrianças=lerInput.nextInt();
        System.out.println("Digite o tamanho dos grupos");
        Grupo = lerInput.nextInt();
        semgrupo= numcrianças%Grupo;
        numGrupos=numcrianças/Grupo;
        System.out.println("Pode se formar " +numGrupos+ " grupos e "+semgrupo+" ficam sem grupo");
    }
}
