package projeto01.net8.pkg2.JavaLinguagemDeProgramacao1.ExemploScanner;

import java.util.Scanner;
/*8 - Faça o programa que leia o nome, o peso, a idade e altura de 20 pessoas
e ao final informe: O nome da pessoa mais velha, o nome da pessoa mais nova,
a média de peso das pessoas com mais de 25 anos e altura 
média das pessoas com menos de 10 anos.*/
public class Exercicio08 {

    public static void main(String[] args) {
        String nome, nomeVelha="", nomeNova="";
        float peso, altura, mediaPeso25, alturaMedia10, somaPeso25=0, somaAltura10=0;
        int idade, velha=0, nova=0, conta25=0, conta10=0, q=20;
        Scanner sc = new Scanner(System.in);
        for (int i=1 ; i <= q; i++){
            System.out.println("Digite o nome: "); 
            nome = sc.next();
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            System.out.println("Digite a altura: ");
            altura = sc.nextFloat();
            System.out.println("Digite o peso: ");
            peso = sc.nextFloat();
            if (i == 1  || idade > velha){
                velha = idade;
                nomeVelha = nome;
            }
            if (i == 1 || idade < nova) {
                nova = idade;
                nomeNova = nome;
            }
            if (idade > 25){
                conta25 ++;
                somaPeso25 += peso;
            }
            if (idade < 10){
                conta10 ++;
                somaAltura10 += altura;
            }
        }
        mediaPeso25 = somaPeso25 / conta25;
        alturaMedia10 = somaAltura10 / conta10;
        System.out.println("Pessoa mais velha: " + nomeVelha);
        System.out.println("Pessoa mais nova: " + nomeNova);
        System.out.println("Media pesoa mais 25: " + mediaPeso25);
        System.out.println("Media altura menos 10: " + alturaMedia10);
    }

    }
