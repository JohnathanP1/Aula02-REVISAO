import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		//Aprendemos criar mensagem
		//Vamos criar um Scanner responsável para exibir que o usuário digita o texto abaixo
		//O que é Scanner ? Um fluxo de dados imagina uma fila indiana com um monte de dados
		//O Scanner é capaz de ler imagina o teclado do seu usuário cada vez que digita esses dados
		//Fica em fila indiana 
		//Após criar um Scanner faça o importe
		Scanner leitor = new Scanner(System.in);
		//String a linha abaixo cria uma variável espaço na memória para guardamos um dado. Nesse caso , o nome do usuário 
		//n minusculo e U maiusculo 
		String nomeUsuario; 
		System.out.println("Por favor, escreva seu nome:");
		//A linha abaixo ler o texto que o usuário escrever no seu teclado
		nomeUsuario = leitor.next();
		
		//A linha abaixo faz exibir a variável ela exibe um texto 
		System.out.println("Obrigado por utilizar o programa" + nomeUsuario);
		
		
		leitor.close();
	}
	}


