package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada de dados
		FileInputStream file = new FileInputStream("teste.txt"); // Recebe os dados em bits
		InputStreamReader input = new InputStreamReader(file); // Recebe os dados em char
		BufferedReader buffer = new BufferedReader(input); // Recebe os dados em String

		String linha = buffer.readLine();

		while (linha != null) {

			System.out.println(linha);
			linha = buffer.readLine();

		}

		buffer.close();

	}

}
