import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);


        System.out.print("Digite o número de identificação do aluno: ");
        int idAluno = notas.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = notas.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = notas.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = notas.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = notas.nextDouble();


        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;


        String Nota;
        if (mediaAproveitamento >= 90) {
            Nota = "A";
        } else if (mediaAproveitamento >= 75) {
            Nota = "B";
        } else if (mediaAproveitamento >= 60) {
            Nota = "C";
        } else if (mediaAproveitamento >= 40) {
            Nota = "D";
        } else {
            Nota = "E";
        }

        String situacao;
        if (Nota.equals("A") || Nota.equals("B") || Nota.equals("C")) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("\nAluno: " + idAluno);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("NOTA : " + Nota);
        System.out.println("Situação: " + situacao);

        notas.close();
    }

}
