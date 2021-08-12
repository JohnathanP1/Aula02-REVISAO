import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		//Scanner é responsável por criar um fluxo de dados usuário digita uma mensagem 
		Scanner leitor = new Scanner (System.in);
		//String é uma variável de texto 
		String nomeUsuario;
		//A linha abaixo exibe um texto e o leitor significa o recebe o texto que o usuário digitar
		System.out.println("Por favor, escreva seu nome:");
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar meu primeiro programa" + nomeUsuario);
		
		
		leitor.close();
		
	}

}
