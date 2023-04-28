import java.util.Scanner;

public class atividade6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("A soma dos números digitados é: " + soma);
    }
}