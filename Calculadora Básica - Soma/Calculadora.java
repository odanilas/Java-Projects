package bia;
import java.util.Scanner;

public class Calculadora {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int numero1 = 0;
		int numero2 = 0;
		int soma = 0;
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = entrada.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = entrada.nextInt();
		
		soma = numero1+numero2;
		
		System.out.printf("A soma dos valores é: %d\n", soma);

	}

}

