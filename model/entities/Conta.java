package model.entities;

import model.exceptions.LimiteSaqueException;

public class Conta {
	
	private Integer numeroConta;
	private String nomeTitular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
		
	}
	
	public Conta (Integer numeroConta, String nomeTitular, Double saldo, Double limiteSaque) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public Integer getNumeroConta() {
		
		return numeroConta;
	}
	
	public void setNumeroConta(Integer numeroConta) {
		
		this.numeroConta = numeroConta;
	}
	
	public String getNomeTitular() {
		
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		
		this.nomeTitular = nomeTitular;
	}
	
	public Double getSaldo() {
		
		return saldo;
	}
	
	public Double getLimiteSaque() {
		
		return limiteSaque;
	}
	
	public void setLimiteSaque(Double limiteSaque) {
		
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double quantidade) {
		
		saldo += quantidade;
	}
	
	public void saque(Double quantidade) throws LimiteSaqueException {
		
		validacaoSaque(quantidade);
		
		saldo -= quantidade;
		
	}
	
	private void validacaoSaque(double quantidade) throws LimiteSaqueException {
		
	    if (quantidade > saldo) {
			
			throw new LimiteSaqueException("Saldo insuficiente para o saque! ");
		}
		
		if (quantidade > limiteSaque) {
			
			throw new LimiteSaqueException("Valor excede o limite de saque permitido! ");
		}
	}

}
