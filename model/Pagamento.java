package model;

import java.util.Date;

public class Pagamento {
	private final ETipoPagamento tipo;
	private final Date data;
	private final double valor;

	public Pagamento(ETipoPagamento tipo, Date data, double valor) {
		super();
		this.tipo = tipo;
		this.data = data;
		this.valor = valor;
	}

	public ETipoPagamento getTipo() {
		return tipo;
	}

	public Date getData() {
		return data;
	}

	public double getValor() {
		return valor;
	}
}
