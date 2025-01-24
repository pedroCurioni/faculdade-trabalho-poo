package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import exception.HospedagemException;

public class Hospedagem {

	private static int InicioCheckIn = 13;
	private static int limiteCheckout = 12;
	private final String id;
	private Date checkin;
	private Date checkout;

	private IHospede hospede;
	private final ArrayList<IHospede> acompanhantes;
	private IAcomodacao acomodacao;
	private IConta conta;
	private ArrayList<Pagamento> pagamento;

	public Hospedagem(String id, IHospede hospede, IAcomodacao acomodacao, IConta conta) throws HospedagemException {
		if (acomodacao.getEstadoOcupacao() != EEstadoOcupacao.DISPONIVEL) {
			throw new HospedagemException("Acomodação indisponivel");
		}

		this.id = UUID.randomUUID().toString();
		this.checkin = new Date();
		this.checkout = null;
		this.hospede = hospede;
		this.acompanhantes = new ArrayList<IHospede>();
		this.acomodacao = acomodacao;
		this.conta = conta;
		this.pagamento = new ArrayList<Pagamento>();
		this.acomodacao.setEstadoOcupacao(EEstadoOcupacao.OCUPADO);
	}

	public static int getInicioCheckIn() {
		return InicioCheckIn;
	}

	public static void setInicioCheckIn(int inicioCheckIn) {
		InicioCheckIn = inicioCheckIn;
	}

	public static int getLimiteCheckout() {
		return limiteCheckout;
	}

	public static void setLimiteCheckout(int limiteCheckout) {
		Hospedagem.limiteCheckout = limiteCheckout;
	}

	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

	public IHospede getHospede() {
		return hospede;
	}

	public void setHospede(IHospede hospede) {
		this.hospede = hospede;
	}

	public IAcomodacao getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(IAcomodacao acomodacao) {
		this.acomodacao = acomodacao;
	}

	public IConta getConta() {
		return conta;
	}

	public void setConta(IConta conta) {
		this.conta = conta;
	}

	public ArrayList<Pagamento> getPagamento() {
		return pagamento;
	}

	public void setPagamento(ArrayList<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}

	public String getId() {
		return id;
	}

	public ArrayList<IHospede> getAcompanhantes() {
		return acompanhantes;
	}

	public void addAcompanhantes(ArrayList<IHospede> i) {
		acompanhantes.addAll(i);
	}

	public int quantidadeOcupantes() {
		return acompanhantes.size() + 1;
	}

	public double calculaTotalDiaria() {
		return (acomodacao.getTarifaDiaria() + acomodacao.getAdicionaAcompanhante()) * (quantidadeOcupantes() - 1);
	}

	public static long getIntervaloDias(Date dataInicial, Date dataFinal) {
		long milisegundoPorDia = (24 * 60 * 60 * 1000);
		return (dataFinal.getTime() - dataInicial.getTime()) / milisegundoPorDia;

	}

	public double precoTotalHospedagem() {
		return getIntervaloDias(checkin, checkout) * calculaTotalDiaria();
	}

	public double precoTotal() {
		return precoTotalHospedagem() + conta.getTotal();
	}

	public StringBuilder listar() {

		StringBuilder sb = new StringBuilder();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		sb.append("\nHospede: " + hospede.getNome());
		sb.append("\nTipo: " + acomodacao.getTipo());
		sb.append("\nCheckin         : " + sdf.format(getCheckin()));
		sb.append("\nCheckout        : " + sdf.format(getCheckout()));
		sb.append("\nOcupantes: " + quantidadeOcupantes());
		sb.append("\nValor Total Diaria: " + calculaTotalDiaria());
		sb.append(conta.listar());
		sb.append("\nPrecoTotal: " + precoTotal());

		return sb;
	}

}
