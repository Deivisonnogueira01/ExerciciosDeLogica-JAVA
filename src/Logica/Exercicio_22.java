package Logica;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kkk = new Scanner(System.in);
		int n = kkk.nextInt();
		// Fazer um programa para ler um n�mero inteiro positivo N. O programa deve
		// ent�o mostrar na tela N linhas,
		// come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o
		// quadrado e o cubo do valor
		for (int i = 1; i <= n; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n %d", primeiro, segundo, terceiro); /// %d numeros inteiros

		}
		kkk.close();
	}

}
