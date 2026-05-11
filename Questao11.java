import java.util.*;

public class Questao11 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros);

        int resultado = soma(numeros);
        System.out.println("A soma dos valores do array é: " + resultado);
    }

    public static int soma(List<Integer> numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }
}