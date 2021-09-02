package br.com.beneration.Exercicios;

import java.util.Scanner;

public class Exercicios3 {
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
/*3-Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	 10-14 infantil
	 15-17 juvenil
	 18-25 adulto*/
	int idade, infantil,juvenil, adulto;
	System.out.println("Digite a Sua Idade: ");
	idade = leia.nextInt();
	if (idade > 10 && idade < 15) {
		System.out.println("Você é Criança! ");
		}
	else if(idade > 15 && idade < 17) {
		System.out.println("Você é juvenil");
		}
	else if(idade > 18 && idade < 15) {
		System.out.println("Você é adulto!");
		}
	}
}

