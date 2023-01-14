package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		
		FileOutputStream file = new FileOutputStream("testeEscrita.txt");
		OutputStreamWriter writter = new OutputStreamWriter(file);
		BufferedWriter buffered = new BufferedWriter(writter);
		
		
		buffered.write("Teste de leitura");	
		buffered.newLine();
		buffered.newLine();
		buffered.newLine();
		buffered.write("Outro teste");
		
		buffered.close();
		
	}

}
