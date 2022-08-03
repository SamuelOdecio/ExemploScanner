package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*13 - O Departamento Estadual de Meteorologia lhe contratou para desenvolver
um programa que leia  um conjunto indeterminado de temperaturas, e informe ao
final a menor e a maior temperaturas informadas, bem como a média das temperaturas.*/
public class Exercicio13 {

    public static void main(String[] args) {

        String aux;
        int qtdtemperatura, maiortemp, menortemp, media, auxiliar;
        aux = JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE TEMP: ");
        qtdtemperatura = Integer.parseInt(aux);

        for (int i = 0; i < qtdtemperatura; i++) {
            aux = JOptionPane.showInputDialog("DIGITE A TEMPERATURA: ");
            auxiliar = Integer.parseInt(aux);
            
        }

    }
}
