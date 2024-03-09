import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        System.out.println("Desafio 01");

        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Soma = " + SOMA);

        System.out.println("--------------------------------------");
        System.out.println("Desafio 02");

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int a = 0;
        int b = 1;
        boolean verificaFibonacci = false;

        while (a <= numero) {
            if (a == numero) {
                verificaFibonacci = true;
                break;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        if (verificaFibonacci) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("--------------------------------------");
        System.out.println("Desafio 05");

        System.out.print("Digite uma string: ");
        String palavra = sc.nextLine();

        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = palavra.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }

        System.out.print("String invertida: ");
        for (char c : caracteres) {
            System.out.print(c);
        }

        sc.close();
    }
}