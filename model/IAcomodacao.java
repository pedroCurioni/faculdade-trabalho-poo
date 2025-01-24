package model;

public interface IAcomodacao {

	public int getNumero();

	public int getOcupacaoMax();

	public void setEstadoOcupacao(EEstadoOcupacao estadoOcupacao);

	public EEstadoOcupacao getEstadoOcupacao();

	public String getTipo();

	public double getTarifaDiaria();

	public double getAdicionaAcompanhante();

}
