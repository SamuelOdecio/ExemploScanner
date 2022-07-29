package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import javax.swing.JOptionPane;

/*2 - Faça um um programa em Java que  imprima a média aritmética dos números 8,9 e 7.
A média dos números 4, 5 e 6. A soma das duas médias. A média das médias. */
public class Exercicio02 {

    public static void main(String[] args) {
        float media1 = ((8 + 9 + 7) / 3);
        float media2 = ((4 + 5 + 6) / 3);
        JOptionPane.showMessageDialog(null, "1º MEDIA - (8+9+7) =   "+media1+"\n2º MEDIA - (4+5+6) =   "+media2+"\nSOMA DAS MEDIA: "+(media1+media2)+"\nMEDIA DAS MEDIAS: "+((media1+media2)/2));

    }
}
