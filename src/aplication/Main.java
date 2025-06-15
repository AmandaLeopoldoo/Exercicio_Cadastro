/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/
package aplication;
import entities.Register;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.print("Quantas pessoas seräo digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoas = new Pessoa[n];

        for (int i=0; i< pessoas.length;i++){
            System.out.printf("Dados da %sa pessoa:%n",i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Pessoa(nome,idade,altura);
        }

        Register registro = new Register(pessoas);

        System.out.println();
        double media = registro.alturaMedia();
        System.out.printf("Altura média: %.2f%n", media);

        double menores = registro.idadeMenor();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menores);

        String[] nomesMenores = registro.pessoasmenores();
        if (nomesMenores.length > 0){
            for (int i=0; i < nomesMenores.length; i++){
                System.out.println(nomesMenores[i]);
            }
        }
    sc.close();
    }
}
