package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

/*1 - Faça um um programa em Java que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias 
e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/
import javax.swing.JOptionPane;

public class Exercicio01 {

    public static void main(String[] arg) {
        int idade, meses, dias;
        String aux;
        try {
            aux = JOptionPane.showInputDialog("Digite sua Idade: ");
            idade = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite os meses: ");
            meses = Integer.parseInt(aux);
            aux = JOptionPane.showInputDialog("Digite os dias: ");
            dias = Integer.parseInt(aux);
            idade = (idade*365) + (meses * 30) + (dias);
            JOptionPane.showMessageDialog(null, "IDADE: " + idade + " Dias");
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.toString());
        }
        System.exit(0);
    }
}
