package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter("Teste2.txt"));
		bw.write("Teste teste teste teste testes testes");
		bw.newLine();
		bw.newLine();
		bw.write("Mais uma linha");
		bw.close();
		
		
				
	}

}
