package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import java.util.Scanner;

/*20 - Faça um programa que leia um vetor de 5 posições para números reais e
, depois, um  código inteiro. Se o código for zero, finalize o programa; 
se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa
. Caso o código for diferente de 1 e 2 escreva uma mensagem informando que o código é inválido.*/
public class Exercicio20 {

    public static void main(String[] args) {
        int vetor[] = {2, 4, 99, 4, 33};
        int aux;
        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE 1 OU 2");
        aux = entrada.nextInt();

        switch (aux) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Vetor: " + vetor[i]);
                }

            case 2:
                for (int j = 4; j >= 0; j--) {
                    System.out.println("Vetor: " + vetor[j]);
                }
        }
    }
}
