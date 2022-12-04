package br.com.gabzay.demo.model;

import java.math.BigDecimal;

public class Funcionario {
	String cpf;
	String nome;
	String matricula;
	String turno;
	String nivelHierarquico;
	BigDecimal bonificacao;
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getNivelHierarquico() {
		return nivelHierarquico;
	}
	public void setNivelHierarquico(String nivelHierarquico) {
		this.nivelHierarquico = nivelHierarquico;
	}
	public BigDecimal getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(BigDecimal bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	
}
