package model;

public class Acomodacao implements IAcomodacao {
	private final int numero;
	private final int ocupacaoMax;
	private EEstadoOcupacao estadoOcupacao;
	private TipoAcomodacao tipo;

	public Acomodacao(int numero, int ocupacaoMax, EEstadoOcupacao estadoOcupacao, TipoAcomodacao tipo) {
		super();
		this.numero = numero;
		this.ocupacaoMax = ocupacaoMax;
		this.estadoOcupacao = estadoOcupacao;
		this.tipo = tipo;
	}

	public EEstadoOcupacao getEstadoOcupacao() {
		return estadoOcupacao;
	}

	public void setEstadoOcupacao(EEstadoOcupacao estadoOcupacao) {
		this.estadoOcupacao = estadoOcupacao;
	}

	public String getTipo() {
		return tipo.getNome();
	}

	public void setTipo(TipoAcomodacao tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public int getOcupacaoMax() {
		return ocupacaoMax;
	}

	@Override
	public double getTarifaDiaria() {

		return tipo.getTarifaDiaria();
	}

	@Override
	public double getAdicionaAcompanhante() {
		return tipo.getAdicionaAcompanhante();
	}

}
