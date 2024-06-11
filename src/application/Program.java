package application;

import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		Person vect[] = new Person[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a" + " pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vect[i] = new Person(nome, idade);
		}

		int maisVelha = 0;
		String nomeMaior = null;
		for (int i = 0; i < n; i++) {
			if (vect[i].idade > maisVelha) {
				maisVelha = vect[i].idade;
				nomeMaior = vect[i].nome;
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + nomeMaior);

		sc.close();
	}

}
