import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Random objeto = new Random();
        Scanner leitura = new Scanner(System.in);

        int numero;

        System.out.print("Adivinhe o numero que estou pensando entre 0 e 10 : ");
        Integer NumeroUsuario = leitura.nextInt();


        for(int i=1; i <=1; i++){
            numero = objeto.nextInt(10);

            if(NumeroUsuario == numero){
                System.out.println("Parabens ! Você acertou ");
            }else{
                System.out.println("Ah não, que pena, você errou, o número que eu pensei foi: " + numero);
            }

        }

    }
}
