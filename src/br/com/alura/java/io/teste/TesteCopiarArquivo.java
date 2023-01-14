package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("teste.txt");
		InputStreamReader input = new InputStreamReader(file);
		BufferedReader br = new BufferedReader(input);
		
		
		FileOutputStream fileOutput = new FileOutputStream("novoTeste.txt");
		OutputStreamWriter output = new OutputStreamWriter(fileOutput);
		BufferedWriter bw = new BufferedWriter(output);
		
		
		String linha = br.readLine();
		
		while(linha != null) {			
			bw.write(linha);	
			bw.newLine();
			linha = br.readLine();
			
		}
		
		br.close();
		bw.close();

	}

}
