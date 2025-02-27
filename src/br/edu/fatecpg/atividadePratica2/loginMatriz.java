package br.edu.fatecpg.atividadePratica2;

import java.util.Scanner;

public class loginMatriz {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        String[][] logins = new String[6][2];

	        // Cadastro de logins e senhas
	        System.out.println("Digite os logins e senhas (6 pares):");
	        for (int i = 0; i < 6; i++) {
	            System.out.print("Login " + (i + 1) + ": ");
	            logins[i][0] = scanner.next();
	            System.out.print("Senha " + (i + 1) + ": ");
	            logins[i][1] = scanner.next();
	        }

	        // Tentativa de login
	        System.out.print("\nDigite o login: ");
	        String user = scanner.next();
	        System.out.print("Digite a senha: ");
	        String pass = scanner.next();

	        boolean encontrado = false;

	        // Verifica se o login e senha existem na matriz
	        for (int i = 0; i < 6; i++) {
	            if (logins[i][0].equals(user) && logins[i][1].equals(pass)) {
	                encontrado = true;
	                break;
	            }
	        }

	        // Resultado da verificação
	        if (encontrado) {
	            System.out.println("Login bem-sucedido!");
	        } else {
	            System.out.println("Login ou senha incorretos.");
	        }

	        scanner.close();
	}

}
