package br.com.spring.model;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {

	private BigDecimal valor;
	private ETipoPreco tipo;


	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public ETipoPreco getTipo() {
		return tipo;
	}

	public void setTipo(ETipoPreco tipo) {
		this.tipo = tipo;
	}
	
	 

}
