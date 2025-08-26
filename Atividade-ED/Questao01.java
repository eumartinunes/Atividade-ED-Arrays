/*1.Criar um vetor com 10 idades e exibir em tela as idades maiores 
que 18 anos */

public class Questao01 {
    public static void main(String[] args) {
        int[] idades = {10, 17, 12, 18, 65, 22, 12, 89, 24, 112};

        System.out.println("Idades maiores que 18:");
        for (int i = 0; i < 10; i++) {
            if (idades[i] > 18) {
                System.out.println("Posição " + i + ": " + idades[i]);
            }
        }
    }
}
