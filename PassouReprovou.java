import java.util.Scanner;
import java.lang.Math;

public class PassouReprovou {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a nota da sua primeira prova: ");
        Double primeiraNota = leitura.nextDouble();

        System.out.print("digite a nota da sua segunda prova: ");
        Double segundaNota = leitura.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 6){
            System.out.format("Sua média foi de %.2f Parabens ! você foi aprovado",media);
        }else{
            System.out.format("Sua média foi de %.2f, infelizmente você foi reprovado",media);
        }

    }
}
