import java.util.Scanner;

public class CalculadoraRevisao {
	/*
	 * + SOMAR - SUBTRAIR / DIVIDIR MULTIPLICAR
	 **/

	public static void main(String[] args) {
		// Cria um leitor capazes de ler dados
		// Double guarda n�meros que o usu�rio digita
		Scanner leitor = new Scanner(System.in);
		double primeiroValor;
		double segundoValor;
		double soma, subtracao, divisao, multiplicacao;
		System.out.println("Por favor, digite um valor:");
		// Vamos armazenar o que digitou uma vari�vel nextDouble
		primeiroValor = leitor.nextDouble();
		System.out.println("Por favor , digite o segundo valor");
		segundoValor = leitor.nextDouble();
		soma = primeiroValor + segundoValor;
		System.out.println("A soma entre os dois valores � " + soma);
		subtracao = primeiroValor - segundoValor;
		System.out.println("A soma entre os dois valores � " + subtracao);
		divisao = primeiroValor / segundoValor;
		System.out.println("A soma entre os dois valores � " + divisao);
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("A soma entre os dois valores � " + multiplicacao);
		
		leitor.close();
	}

}
