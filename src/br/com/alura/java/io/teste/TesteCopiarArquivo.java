package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		InputStream file = System.in;
		InputStreamReader input = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(input);
		
		
		OutputStream fileOutput = new FileOutputStream("novoTeste.txt");
		OutputStreamWriter output = new OutputStreamWriter(fileOutput);
		BufferedWriter bw = new BufferedWriter(output);
		
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {			
			bw.write(linha);	
			bw.newLine();
			linha = br.readLine();
			
		}
		
		br.close();
		bw.close();

	}

}
