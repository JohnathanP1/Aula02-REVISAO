import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		//Aprendemos criar mensagem
		//Vamos criar um Scanner respons�vel para exibir que o usu�rio digita o texto abaixo
		//O que � Scanner ? Um fluxo de dados imagina uma fila indiana com um monte de dados
		//O Scanner � capaz de ler imagina o teclado do seu usu�rio cada vez que digita esses dados
		//Fica em fila indiana 
		//Ap�s criar um Scanner fa�a o importe
		Scanner leitor = new Scanner(System.in);
		//String a linha abaixo cria uma vari�vel espa�o na mem�ria para guardamos um dado. Nesse caso , o nome do usu�rio 
		//n minusculo e U maiusculo 
		String nomeUsuario; 
		System.out.println("Por favor, escreva seu nome:");
		//A linha abaixo ler o texto que o usu�rio escrever no seu teclado
		nomeUsuario = leitor.next();
		
		//A linha abaixo faz exibir a vari�vel ela exibe um texto 
		System.out.println("Obrigado por utilizar o programa" + nomeUsuario);
		
		
		leitor.close();
	}
	}


