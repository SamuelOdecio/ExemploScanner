package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

class JoOptionExemplo {

    public static void main(String[] args) {
        String nome, aux;
        float numero;
        int numero2;
        try {
            nome = JOptionPane.showInputDialog("Entre com o nome");
            aux = JOptionPane.showInputDialog("Entre com um numero");
            numero = Float.parseFloat(aux);
            aux = JOptionPane.showInputDialog("Entre com um numero");
            numero2 = Integer.parseInt(aux);
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n Número: " + numero + "\n Int: " + numero2);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.toString());
        }
        System.exit(0);
    }
}
