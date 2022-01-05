/*
 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e 
mostre: 
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
b) a �rea do c�rculo de raio C. (pi = 3.14159) 
c) a �rea do trap�zio que tem A e B por bases e C por altura. 
d) a �rea do quadrado que tem lado B. 
e) a �rea do ret�ngulo que tem lados A e B
 * 
 */
package Logica;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Mat = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo; // Declarar as Variaveis

		System.out.println("Entre Com o Valor de A");
		A = Mat.nextDouble();
		System.out.println("Entre Com O Valor de B");
		B = Mat.nextDouble();
		System.out.println("Entre Com o Valor de C");
		C = Mat.nextDouble();

		triangulo = A * C / 2.0; /// Processo de Calculo das Variaveis
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;

		System.out.printf("TRIANGULO: %.2f%n", triangulo); /// Impressao
		System.out.printf("CIRCULO: %.2f%n", circulo);
		System.out.printf("TRAPEZIO: %.2f%n", trapezio);
		System.out.printf("QUADRADO: %.2f%n", quadrado);
		System.out.printf("RETANGULO: %.2f%n", retangulo);

		Mat.close();

	}

}
