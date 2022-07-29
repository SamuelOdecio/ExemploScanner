package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.print("Digite o seu nome: ");
        Scanner sc = new Scanner(System.in); // Criar Objeto e faz leitura
        String nome = sc.next();
        System.out.println("Nome: " + nome);
        float numero;
        try {
            System.out.print("Digite um numero: ");
            sc = new Scanner(System.in);
            numero = sc.nextFloat();
            System.out.println("Valor: " + numero);
            System.out.print("Digite um numero inteiro: ");
            sc = new Scanner(System.in);
            int numero2;
            numero2 = sc.nextInt();
            System.out.println("Valor Inteiro: " + numero2);
            
            
            
        } catch (NumberFormatException erro) {
            System.out.println("Erro: " + erro.toString());
        } catch (InputMismatchException erro2) {
            System.out.println("Erro: foi digitado letras " + erro2.toString());
        }
    }
}
