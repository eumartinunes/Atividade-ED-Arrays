/* 2.Criar um vetor com 4 notas e exibir em tela a média aritmética 
das notas*/
public class Questao02 {
    public static void main(String[] args) {
        double[] notas = {7.0, 8.5, 10.0, 6.5};
        double soma = 0;
        
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }
        double media = soma / 4;
        System.out.println("A média das notas é: " + media);
    }
}

