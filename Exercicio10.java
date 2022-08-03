package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*10 - Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números ímpares.*/
public class Exercicio10 {

    public static void main(String[] args) {
        String aux;
        int inteiro, resto, par = 0, impar = 0;
        for (int i = 0; i <= 10; i++) {
            aux = JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO: ");
            inteiro = Integer.parseInt(aux);
            resto = inteiro % 2;
            if (resto == 0) {
                par++;
            } else if (resto != 0) {
                impar++;
            }
        }
            JOptionPane.showMessageDialog(null, "NUMEROS IMPARES: " + impar +"\nNUMEROS PARES: " +par);
    }
}
