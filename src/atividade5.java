import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int numero = input.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.printf("%d números estão entre 0 e 100.", contador);
    }
}