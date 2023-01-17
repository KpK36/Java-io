package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("Teste3.txt");
		//PrintWriter pw = new PrintWriter("Teste3.txt");
		
		ps.println("Tem alguma coisa escrita aqui para que seja apenas testada");
		ps.println();
		ps.println();
		ps.println("Outra coisa escrita aquadasdai");
		
		ps.close();
				
	}

}
