package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("contas.csv"), "windows-1252");

		while (scanner.hasNextLine()) {

			Scanner linhaScanner = new Scanner(scanner.nextLine());

			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int conta = linhaScanner.nextInt();
			String nome = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format("%s, %04d, %04d, %s, %.2f %n", tipoConta, agencia, conta, nome, saldo);

			linhaScanner.close();

		}

		scanner.close();

	}

}
