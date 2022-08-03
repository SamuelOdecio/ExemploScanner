package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*11 - A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55
,... Faça um programa capaz de gerar a série até o n−ésimo
termo que deve ser informado pelo usuário.*/
public class Exercicio11 {

    public static void main(String[] args) {
        String aux;
        int nesimo, auxiliar = 0, auxiliar1 = 1;

        aux = JOptionPane.showInputDialog("Digite o tamanho da serie de Fibonacci: ");
        nesimo = Integer.parseInt(aux);
        int fibonacci[] = new int[nesimo];

        for (int i = 0; i < nesimo; i++) {
            auxiliar = auxiliar + auxiliar1;
            auxiliar1 = auxiliar - auxiliar1;
            System.out.println(auxiliar);
        }

    }
}
