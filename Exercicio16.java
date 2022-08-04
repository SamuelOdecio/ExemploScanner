package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

/*16 -Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve necessariamente
iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário.*/
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        int tabuadaInicio, tabuadaFinal, tabuada;

        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE A TABUADA: ");
        tabuada = entrada.nextInt();

        System.out.println("DIGITE O INDICE INICIAL: ");
        tabuadaInicio = entrada.nextInt();

        System.out.println("DIGITE O INDICE FINAL: ");
        tabuadaFinal = entrada.nextInt();

        while (tabuadaInicio != tabuadaFinal) {
            
        }
    }
}
