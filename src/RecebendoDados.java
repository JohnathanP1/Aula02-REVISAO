import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		//Scanner � respons�vel por criar um fluxo de dados usu�rio digita uma mensagem 
		Scanner leitor = new Scanner (System.in);
		//String � uma vari�vel de texto 
		String nomeUsuario;
		//A linha abaixo exibe um texto e o leitor significa o recebe o texto que o usu�rio digitar
		System.out.println("Por favor, escreva seu nome:");
		nomeUsuario = leitor.next();
		System.out.println("Obrigado por utilizar meu primeiro programa" + nomeUsuario);
		
		
		leitor.close();
		
	}

}
