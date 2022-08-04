package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*13 - O Departamento Estadual de Meteorologia lhe contratou para desenvolver
um programa que leia  um conjunto indeterminado de temperaturas, e informe ao
final a menor e a maior temperaturas informadas, bem como a média das temperaturas.*/
public class Exercicio13 {

    public static void main(String[] args) {

        String aux;
        int maiortemp = 0, menortemp = 0, media = 0, auxiliar, contador = 0, auxtemp;

        int verificador = 0, verifica = 0;

        while (verificador != 999) {
            aux = JOptionPane.showInputDialog("DIGITE A TEMPERATURA: ");
            auxiliar = Integer.parseInt(aux);
            media = media + auxiliar;
            auxtemp = auxiliar;
            menortemp = auxiliar;
            contador++;

            if (auxtemp > maiortemp) {
                maiortemp = auxtemp;
            }
            if (menortemp > auxiliar) {
                menortemp = auxiliar;
            }

            aux = JOptionPane.showInputDialog("DESEJA CONTINUAR? - Sim(1) OU Não(2): ");
            verifica = Integer.parseInt(aux);
            if (verifica == 2) {
                verificador = 999;
            }
        }

        JOptionPane.showMessageDialog(null, "MENOR TEMPERATURA: " + menortemp + "\nMAIOR TEMPERATURA: " + maiortemp + "\nMEDIA TEMPERATURAS: " + (media / contador));
    }
}
