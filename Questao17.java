import java.util.*;

public class Questao17 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número e irei verificar se ele é primo ou não: ");
        int num = input.nextInt();
        input.nextLine();

        if (primo(num)){
            System.out.println("O número " + num + " é primo.");
        }else{
            System.out.println("O númeor " + num + " não é primo.");
        }
        
        input.close();
    }

    public static boolean primo (int num){

        if (num < 1){
            return false;
        }

        if (num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i+=2){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }
}
