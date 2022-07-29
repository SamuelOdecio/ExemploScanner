package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*7 - Faça um programa que receba a idade e o peso de sete pessoas.
Calcule e mostre: A quantidade de pessoas com mais de 90 quilos;
A média das idades das sete pessoas; */
public class Exercicio07 {

    public static void main(String[] args) {
        int idadeP1, idadeP2, idadeP3, idadeP4, idadeP5, idadeP6, idadeP7;
        int pesoP1,pesoP2,pesoP3,pesoP4,pesoP5,pesoP6,pesoP7;
        float mediaIdade, qtdPeso = 0;
        String aux;
        aux = JOptionPane.showInputDialog("PESSOA1 - DIGITE SUA IDADE: ");
        idadeP1 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA1 - DIGITE SEU PESO: ");
        pesoP1 = Integer.parseInt(aux);
        if (pesoP1 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA2 - DIGITE SUA IDADE: ");
        idadeP2 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA2 - DIGITE SEU PESO: ");
        pesoP2 = Integer.parseInt(aux);
        if (pesoP2 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA3 - DIGITE SUA IDADE: ");
        idadeP3 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA3 - DIGITE SEU PESO: ");
        pesoP3 = Integer.parseInt(aux);
        if (pesoP3 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA4 - DIGITE SUA IDADE: ");
        idadeP4 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA4 - DIGITE SEU PESO: ");
        pesoP4 = Integer.parseInt(aux);
        if (pesoP4 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA5 - DIGITE SUA IDADE: ");
        idadeP5 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA5 - DIGITE SEU PESO: ");
        pesoP5 = Integer.parseInt(aux);
        if (pesoP5 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA6 - DIGITE SUA IDADE: ");
        idadeP6 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA6 - DIGITE SEU PESO: ");
        pesoP6 = Integer.parseInt(aux);
        if (pesoP6 > 90){qtdPeso++;}
        
        aux = JOptionPane.showInputDialog("PESSOA7 - DIGITE SUA IDADE: ");
        idadeP7 = Integer.parseInt(aux);
        aux = JOptionPane.showInputDialog("PESSOA7 - DIGITE SEU PESO: ");
        pesoP7 = Integer.parseInt(aux);
        if (pesoP7 > 90){qtdPeso++;}
        
        mediaIdade = ((idadeP1 + idadeP2 + idadeP3 + idadeP4 + idadeP5 + idadeP6 + idadeP7)/7);
        
        JOptionPane.showMessageDialog(null,"TABELA - IDADE - PESO\n" +qtdPeso+ " Pessoas acima de 90Kg.\n"+mediaIdade+" É a média de idade.");
    }
}
