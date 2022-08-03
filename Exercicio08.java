package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*8 - Faça o programa que leia o nome, o peso, a idade e altura de 20 pessoas
e ao final informe: O nome da pessoa mais velha, o nome da pessoa mais nova,
a média de peso das pessoas com mais de 25 anos e altura 
média das pessoas com menos de 10 anos.*/
public class Exercicio08 {

    public static void main(String[] args) {
        int tamanho = 2;
        String nomes[] = new String[tamanho];
        int idade[] = new int[tamanho];
        int altura[] = new int[tamanho];
        int peso[] = new int[tamanho];
        String aux;
        int contador = 0, auxiliar;
        for (int i = 0; i < tamanho; i++) {
            nomes[i] = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SEU NOME: ");
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SEU PESO: ");
            peso[i] = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SUA IDADE: ");
            idade[i] = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("PESSOA " + (i + 1) + " DIGITE SUA ALTURA:  (em CM)");
            altura[i] = Integer.parseInt(aux);

        }
        auxiliar = idade[tamanho];
        for (int i = 0; i <= tamanho; i++) {
            if (auxiliar < idade[i]) {
                auxiliar = idade[i];
                contador = i;

            }
        }

        JOptionPane.showMessageDialog(null, "O Nome da Pessoa mais velha é: " + nomes[contador]);
    }
}
