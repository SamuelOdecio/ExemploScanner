package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

/*21 - Faça um programa que crie um vetor de 20 posições preenchido com os 20 menores números primos positivos.*/
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[20];
        int primo = 2;
        
         for(int i = 0;i<=primo;i++) {
             
            if(i%2==1) {
                vetor[i] = primo;
                System.out.println(vetor[i]);
            }
            primo++;
        }
    }
}
