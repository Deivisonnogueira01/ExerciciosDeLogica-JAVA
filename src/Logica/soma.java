package Logica;

import java.util.Scanner;

//Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias

//Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. Nos casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.

//O arquivo de entrada cont�m um valor inteiro.

public class soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre Com seus dias de vida");
		int idade = sc.nextInt();

		int ano = idade / 365;

		int mes = (idade % 365) / 30;

		int dias = (idade % 365) % 30;

		System.out
				.println("Ela Possui : " + ano + " Ano de Idade  e " + mes + " meses " + "e " + dias + " dias de vida");

		sc.close();
	}

}
