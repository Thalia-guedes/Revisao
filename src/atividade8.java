import java.util.Scanner;

public class atividade8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, reajuste;

        System.out.println("Informe os salários (para encerrar digite -1):");

        salario = input.nextDouble();
        while (salario != -1) {
            System.out.println("Salário atual: R$" + salario);
            System.out.println("Informe o reajuste (em %):");
            reajuste = input.nextDouble();
            salario += salario * (reajuste / 100);
            System.out.println("Novo salário: R$" + salario);
            System.out.println();
            salario = input.nextDouble();
        }
    }
}