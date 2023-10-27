import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] num =new int[10];
        int[] pares =new int[10];
        int[] impares =new int[10];
        int contPares = 0, contImpares = 0;

        System.out.println("Informe 10 numeros inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe " +(i + 1)+ " numero: ");
            num[i] = input.nextInt();

            if (num[i] % 2 == 0){
                pares[contPares] = num[i];
                contPares++;
            } else {
                impares[contImpares] = num[i];
                contImpares++;
            }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < contPares; i++) {
            System.out.println(pares[i] + " ");
        }

        System.out.println("\n numeros impares");

        input.close();
    }
}
