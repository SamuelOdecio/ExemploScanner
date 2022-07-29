package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*3 - Faça um um programa em Java que leia o valor de um produto e a porcentagem de aumento,
ao final mostre o valor do aumento e o novo valor do produto. */
public class Exercicio03 {

    public static void main(String[] args) {
        float produto, porcentagem,valorFinal;
        String aux;
        aux = JOptionPane.showInputDialog("Digite o Valor do produto: ");
        produto = Float.parseFloat(aux);
        aux = JOptionPane.showInputDialog("Digite a Porcentagem de Aumento: ");
        porcentagem = Float.parseFloat(aux);

        valorFinal = produto + ((porcentagem * produto) / 100);

        JOptionPane.showMessageDialog(null, "VALOR DO PRODUTO: R$" + produto + "\nVALOR DO AUMENTO: R$" +((porcentagem*produto)/100) + "\nVALOR FINAL: R$" + valorFinal);

        }
    }
