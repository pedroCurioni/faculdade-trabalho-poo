package model;

public class TipoAcomodacao {
	private final String nome;
	private double tarifaDiaria;
	private double adicionaAcompanhante;

	public TipoAcomodacao(String nome, double tarifaDiaria, double adicionaAcompanhante) {
		super();
		this.nome = nome;
		this.tarifaDiaria = tarifaDiaria;
		this.adicionaAcompanhante = adicionaAcompanhante;
	}

	public double getTarifaDiaria() {
		return tarifaDiaria;
	}

	public void setTarifaDiaria(double tarifaDiaria) {
		this.tarifaDiaria = tarifaDiaria;
	}

	public double getAdicionaAcompanhante() {
		return adicionaAcompanhante;
	}

	public void setAdicionaAcompanhante(double adicionaAcompanhante) {
		this.adicionaAcompanhante = adicionaAcompanhante;
	}

	public String getNome() {
		return nome;
	}
	
	

}
