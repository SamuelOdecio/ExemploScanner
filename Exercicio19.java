package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

/*19 -Faça um programa que leia um vetor de 10 posições e verifique se 
existem valores iguais, caso exista,
imprima na tela os número iguais e as 
posições que eles se encontram.*/
public class Exercicio19 {

    public static void main(String[] args) {
        int vetor[] = {2, 4, 99, 4, 33, 8, 77, 66, 2, 8};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (j != i && vetor[i] == vetor[j]) {
                    System.out.println("INDICES IGUAIS: " + i);
                    System.out.println("INDICES IGUAIS: " + j);
                    System.out.println("VALOR IGUAL: " + vetor[i]);
                }
            }
        }
    }
}
