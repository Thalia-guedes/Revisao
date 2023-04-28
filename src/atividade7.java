import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite um número inteiro: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(nome);
        }
    }
}