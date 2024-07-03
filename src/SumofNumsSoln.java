
import java.util.Scanner;

public class SumofNumsSoln {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Digite um número (-1 para sair): ");
        int number = console.nextInt();

        do
        {
             
            sum = sum + number;     
            System.out.print("Digite um número (-1 para sair): ");
            number = console.nextInt();
        }while (number != -1);

        System.out.println("A soma é " + sum);

    }
}
