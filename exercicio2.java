package br.com.beneration.condicionais;
/*2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente..*/
public class JOptionPane { 
public static void main (String [] args) {
	
int numero1;
int numero2;
int numero3;
int numero4;
int auxiliar;

numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));
numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 4"));

if (numero1 > numero2) {
    auxiliar = numero1;
    numero1 = numero2;
    numero2 = auxiliar;
}

if (numero2 > numero3) {
    auxiliar = numero2;
    numero2 = numero3;
    numero3 = auxiliar;

}
 

if (numero1 > numero2) {
    auxiliar = numero1;
    numero1 = numero2;
    numero2 = auxiliar;
}
 
 
 
 
 
 
JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 + " " + numero2 + " " + numero3);

JOptionPane.showMessageDialog(null, "Ordem decescente: " +numero4 +" "+ numero3 + " " + numero2 + " " + numero1);

}

private static void showMessageDialog(Object object, String string) {	
}

private static String showInputDialog(String string) {
	return null;
}
}

