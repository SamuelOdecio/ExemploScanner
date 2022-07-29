package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;
/*5 - Faça um um programa em Java que leia o valor do salário mínimo e o 
valor do salário de um usuário, calcule a quantidade de salários 
mínimos que esse usuário ganha e imprima o resultado. */
public class Exercicio05 {

    public static void main(String[] args) {
        float salario, salarioMinimo;
        String aux;
        aux = JOptionPane.showInputDialog("Digite o Salario Minimo: ");
        salarioMinimo = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Digite seu Salario: ");
        salario = Float.parseFloat(aux);
        
        salario = salario/salarioMinimo;
        JOptionPane.showMessageDialog(null,"O usuario recebe " + salario + " Salarios Minimos.");
        
    }
}
