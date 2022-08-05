package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

/*17 - Leia um vetor de 10 posições de elementos inteiros.
Contar e escrever quantos valores pares ele possui.*/

public class Exercicio17 {

    public static void main(String[] args) {

        int vetor[] = {2, 4, 99, 44, 33, 55, 77, 66, 23, 8};
        int par = 0, resto, contador = 0;
        for (int i = 0; i < 10; i++) {
            par = vetor[i];
            resto = par % 2;
            if (resto == 0) {
                contador++;
            }
        }
        System.out.println("PARES: " + contador);
    }
}

