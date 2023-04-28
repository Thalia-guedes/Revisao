public class atividade9 {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        for (int i = 0; i < 50; i++) {
            vetor[i] = i + 101;
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(vetor[i]);
        }
    }
}