import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] idades = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
            int idade = input.nextInt();
            idades[i] = idade;


        }
        int soma = 0;
        for (int idade : idades) {
            soma += idade;
        }
        double media = (double) soma / idades.length;

        System.out.printf("A média das idades é %.2f.", media);
        }
    }





