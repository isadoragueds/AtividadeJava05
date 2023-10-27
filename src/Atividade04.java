import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] numeroInteiro = new int[30];

        for (int i = 0; i < numeroInteiro.length; i++) {
            System.out.print("Informe um numero para o " +(i + 1) +"º:");
            numeroInteiro[i] = input.nextInt();
        }

        System.out.println("Posicao em que os valores 30 apareceram: ");

        for (int i = 0; i < numeroInteiro.length; i++) {
            if (numeroInteiro[i] == 30) {
                System.out.println("Posicao " +(i + 1));
            }
        }

        input.close();
    }
}