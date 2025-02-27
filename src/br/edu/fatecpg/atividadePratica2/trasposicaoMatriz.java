package br.edu.fatecpg.atividadePratica2;

import java.util.Scanner;

public class trasposicaoMatriz {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int[][] matrizOriginal = new int[3][2];
	        int[][] matrizTransposta = new int[2][3];

	        
	        System.out.println("Digite os valores da matriz 3x2:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                matrizOriginal[i][j] = scanner.nextInt();
	            }
	        }

	        // Transpondo a matriz 
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 2; j++) {
	                matrizTransposta[j][i] = matrizOriginal[i][j];
	            }
	        }

	        
	        System.out.println("Matriz transposta (2x3):");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrizTransposta[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	}

}
