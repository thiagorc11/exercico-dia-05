import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número inteiro e 0 para sair: ");
            numero = input.nextInt();

            if (numero == 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        input.close();
    }
}