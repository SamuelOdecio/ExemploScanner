package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*6 -Um programa para gerenciar os saques de um caixa eletrônico deve possuir
algum mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado
para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima"
no sentido de que as notas de menor valor fossem distribuídas em número mínimo possível.
Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar uma nota de R$ 50,00,
três notas de R$ 10,00, uma nota de R$ 5,00 e duas notas de R$ 1,00. Escreva um programa que receba
o valor da quantia solicitada e retorne a distribuição das notas de acordo com o critério da distribuição ótima
(considere existir notas de R$1,00; R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).*/
public class Exercicio06 {

    public static void main(String[] args) {
        String aux;
        int saque, troco = 0, qt1 = 0, qt2 = 0, qt5 = 0, qt10 = 0, qt20 = 0, qt50 = 0, qt100 = 0;

        aux = JOptionPane.showInputDialog("Digite o valor do saque R$: ");
        saque = Integer.parseInt(aux);
        troco = saque;
        for (int i = troco; i != 0; i--) {
            if (saque >= 100) {
                saque = saque - 100;
                qt100++;
            }
            else if (saque >= 50) {
                saque = saque - 50;
                qt50++;
            }
            else if (saque >= 20) {
                saque = saque - 20;
                qt20++;
            }
            else if (saque >= 10) {
                saque = saque - 10;
                qt10++;
            }
            else if (saque >= 5) {
                saque = saque - 5;
                qt5++;
            }
            else if (saque >= 2) {
                saque = saque - 2;
                qt2++;
            }
            else if (saque >= 1) {
                saque = saque - 1;
                qt1++;
            }
        }
        JOptionPane.showMessageDialog(null, "---------TROCO---------\nCedulas de R$100: " + qt100 + "\nCedulas de R$50: " + qt50 + "\nCedulas de R$20: " + qt20 + "\nCedulas de R$10: " + qt10 + "\nCedulas de R$5: " + qt5 + "\nCedulas de R$2: " + qt2 + "\nMoedas de R$1: " + qt1);
    }
}
