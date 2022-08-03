package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;


/*12 - A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
Faça um programa que gere a série até que o valor seja maior que 500.*/
public class Exercicio12 {

    public static void main(String[] args) {
        int auxiliar = 0, auxiliar1 = 1;

        

        while (auxiliar < 500) {
            auxiliar = auxiliar + auxiliar1;
            auxiliar1 = auxiliar - auxiliar1;
            
            System.out.println("FIBONACCI: " + auxiliar1);
        }

    }
}
