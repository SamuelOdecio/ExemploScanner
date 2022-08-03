package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*4 - Faça um um programa em Java que leia a porcentagem do IPI a ser acrescido
no valor das peças - o código da peça 1, valor unitário da peça 1, 
quantidade de peças 1 - o código da peça 2, valor unitário da peça 2,
quantidade de peças 2 O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)*/
public class Exercicio04 {

    public static void main(String[] args) {
        int valor1, valor2, quant1, quant2, ipi, cod1, cod2;
        String aux;
        aux = JOptionPane.showInputDialog("DIGITE O VALOR DE IPI%: ");
        ipi = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("DIGITE O CODIGO DA PEÇA1: ");
        cod1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("DIGITE O VALOR UNITARIO PEÇA1: ");
        valor1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("DIGITE A QTD DE PEÇA1: ");
        quant1 = Integer.parseInt(aux);

        aux = JOptionPane.showInputDialog("DIGITE O CODIGO DA PEÇA2: ");
        cod2 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("DIGITE O VALOR UNITARIO PEÇA2: ");
        valor2 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("DIGITE A QTD DE PEÇA2: ");
        quant2 = Integer.parseInt(aux);

        JOptionPane.showMessageDialog(null, "RESULTADO: " + (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1));

    }

}
