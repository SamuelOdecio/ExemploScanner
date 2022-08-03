package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*9 - Faça um programa que receba dois números inteiros e gere os números
inteiros que estão no intervalo compreendido por eles.*/
public class Exercicio09 {

    public static void main(String args[]) {
        String aux;
        int inteiro1, inteiro2;

        aux = JOptionPane.showInputDialog("Digite um Numero Inteiro: ");
        inteiro1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("Digite outro Numero Inteiro: ");
        inteiro2 = Integer.parseInt(aux);
        
        
        
/*
        while () {
            if (inteiro1 < inteiro2) {
                JOptionPane.showMessageDialog(null, "Numero no intervalo: " + inteiro1);
                inteiro1++;
            } else {
                JOptionPane.showMessageDialog(null, "Numero no intervalo: " + inteiro1);
                inteiro1--;
            }

        }
*/
    }
}
