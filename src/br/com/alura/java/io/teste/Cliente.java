package br.com.alura.java.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nome;
	String profissao;
	double salario;

	/**
	 * Construtor para inicializar o objeto a partir do nome
	 * 
	 * @param nome
	 */

	public Cliente(String nome) {

		if (nome.isBlank()) {

			throw new NullPointerException("O nome nao pode estar branco");

		}

		System.out.println("Cliente criado!\n" + nome);

		this.nome = nome;

	}

	/**
	 * Construtor para inicializar o objeto sem parametros
	 * 
	 */

	public Cliente() {

	}

	/**
	 * Metodo para retornar o nome do Cliente
	 * 
	 * @return String
	 */

	public String getNome() {
		return this.nome;
	}

	/**
	 * Metodo para definir o atributo nome do objeto cliente
	 * 
	 * @param nome
	 */

	public void setNome(String nome) {

		if (nome.isBlank()) {
			throw new NullPointerException("O nome nao pode estar branco");
		}
		this.nome = nome;

	}

	/**
	 * Metodo para retornar o atributo profissao do objeto cliente
	 * 
	 * @return String
	 */

	public String getProfissao() {
		return this.profissao;
	}

	/**
	 * Metodo para retornar o atributo salario do objeto cliente
	 * 
	 * @return double
	 */

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome;
	}

}
