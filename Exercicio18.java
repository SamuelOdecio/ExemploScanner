package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import java.util.Scanner;

/*18 - Fazer um programa para ler 15 valores inteiros e, em seguida,
mostrar todos os valores lidos juntamente com o maior, 
o menor e a média dos valores.*/
public class Exercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[15];
        int maior = 0, menor = 999, media = 0;

        for (int i = 0; i < 15; i++) {
            System.out.println("DIGITE UM VALOR INTEIRO:");
            vetor[i] = entrada.nextInt();
            media = media + vetor[i];
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        for (int j = 0; j < 15; j++) {
            System.out.println("VETOR: " + vetor[j]);
        }

        System.out.println("MAIOR: " + maior);
        System.out.println("MENOR: " + menor);
        System.out.println("MÉDIA: " + (media / vetor.length));

    }
}
