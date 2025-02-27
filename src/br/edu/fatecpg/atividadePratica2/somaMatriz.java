package br.edu.fatecpg.atividadePratica2;

import java.util.Scanner;

public class somaMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] soma = new int[3][3];

        
        System.out.println("Digite os valores da matriz A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Digite os valores da matriz B (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Somando as matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        
        System.out.println("Resultado da soma das matrizes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

	}

}
