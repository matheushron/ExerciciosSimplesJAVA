import java.util.Random;

public class LancamentoDeDado {
    public static void main(String[] args) {


        //criando um objeto com o Random
        Random objeto = new Random();

        int number;

        for(int i=1; i <=1; i++){
            number = 1 +  objeto.nextInt(5);
            System.out.println(number + " ");
        }
    }

}