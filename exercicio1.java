package br.com.beneration.Exercicios;
/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args){
Scanner leia = new Scanner(System.in);
int n1, n2, n3;
	System.out.println("Por Valor Entre com o Seu Primeiro Valor: ");
	n1 = leia.nextInt();
	System.out.println("Agora o Seu Segujndo Valor: ");
	n2 = leia.nextInt();
	System.out.println("Terceiro Valor: ");
	n3 = leia.nextInt();
	if (n1 > n2 && n1 > n3){
		System.out.println("O Valor Maior �:"+n1);
	}else if(n2 > n1 && n2 > n3){
		System.out.println("O Valor Maior �: "+n2);
	}else if(n3 > n1 && n3 > n2){
		System.out.println("O Valor Maior �: "+n3);
		}else{
		}
	}
}
/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/