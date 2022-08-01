package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*8 - Faça o programa que leia o nome, o peso, a idade e altura de 20 pessoas
e ao final informe: O nome da pessoa mais velha, o nome da pessoa mais nova,
a média de peso das pessoas com mais de 25 anos e altura 
média das pessoas com menos de 10 anos.*/
public class Exercicio08 {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        int idade[] = new int[5];
        int altura[] = new int[5];
        int peso[] = new int[5];
        String aux;
        int contador, auxiliar;
        for (int i = 0; i <= 20; i++) {
            nomes[i] = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SEU NOME: ");
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SEU PESO: ");
            peso[i] = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SUA IDADE: ");
            idade[i] = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SUA ALTURA:  (em CM)");
            altura[i] = Integer.parseInt(aux);

        }
        auxiliar = idade[0];
        for (int i = 1; i <= 20; i++) {
            if (auxiliar < idade[i]) {
                auxiliar = idade[i];
                contador = i;
                
            }
        }
        
        JOptionPane.showMessageDialog(null, "O Nome da Pessoa mais velha é: "  );
    }
}
