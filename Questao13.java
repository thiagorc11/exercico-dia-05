import java.util.*;

public class Questao13 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int num = 1;
        while (num != 0){
            System.out.println("Digite os valores inteiros, positivos ou negativos, desejados para o array. (Digite 0 para finalizar o array):");
            num = input.nextInt();
            
            if (num == 0){
                break;
            }
            
            numbers.add(num);
        }

        numbers.removeIf(n -> n < 0);
        

        System.out.println(numbers);
        input.close();
    }
    
}
