package model;

public class Item {
	private final long codigo;
	private final String descricao;
	private double preco;

	public Item(long codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public long getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();

		sb.append("Codigo: ").append(codigo).append("\t");
		sb.append("Descrição: ").append(descricao).append("\t");
		sb.append("Preço: ").append(preco).append("\t");

		return sb;
	}

}
