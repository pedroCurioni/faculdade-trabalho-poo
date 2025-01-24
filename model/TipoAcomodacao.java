package model;

import exception.TipoAcomodacaoException;

public class TipoAcomodacao {
	private final String nome;
	private double tarifaDiaria;
	private double adicionaAcompanhante;

	public TipoAcomodacao(String nome, double tarifaDiaria, double adicionaAcompanhante)
			throws TipoAcomodacaoException {

		if (nome == null || nome.isBlank() || nome.isEmpty()) {
			throw new TipoAcomodacaoException("O tipo da acomodação deve ter um nome informado");
		}

		this.nome = nome;
		this.setTarifaDiaria(tarifaDiaria);
		this.setAdicionaAcompanhante(adicionaAcompanhante);
	}

	public String getNome() {
		return nome;
	}

	public double getTarifaDiaria() {
		return tarifaDiaria;
	}

	public void setTarifaDiaria(double tarifaDiaria) throws TipoAcomodacaoException {
		if (tarifaDiaria <= 0) {
			throw new TipoAcomodacaoException("Tarifa diaria deve ter valor maior que 0");
		}

		this.tarifaDiaria = tarifaDiaria;
	}

	public double getAdicionaAcompanhante() {
		return adicionaAcompanhante;
	}

	public void setAdicionaAcompanhante(double adicionaAcompanhante) throws TipoAcomodacaoException {
		if (adicionaAcompanhante <= 0) {
			throw new TipoAcomodacaoException("Adicional de acompanhante deve ter valor maior que 0");
		}

		this.adicionaAcompanhante = adicionaAcompanhante;
	}

}
