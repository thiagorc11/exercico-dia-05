import java.util.*;

public class Questao14 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersNoRep = new ArrayList<>();

        System.out.println("Digite 10 valores inteiro para seu array: ");
        for (int i = 0; i < 5; i++){
            int num = input.nextInt();
            input.nextLine();
            numbers.add(num);
        }
          
        for (Integer num : numbers){
            if (!numbersNoRep.contains(num)){
                numbersNoRep.add(num);
            }
        }
       
        System.out.println(numbersNoRep);
        input.close();
    }

}