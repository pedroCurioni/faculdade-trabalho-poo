package model;

import java.util.Date;

public class ItemConta {
	private final Date dataHora;
	private final double preco;
	private final int qtde;

	private final Item item;

	public ItemConta(Date dataHora, double preco, int qtde, Item item) {
		super();
		this.dataHora = dataHora;
		this.preco = preco;
		this.qtde = qtde;
		this.item = item;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public double getPreco() {
		return preco;
	}

	public int getQtde() {
		return qtde;
	}

	public Item getItem() {
		return item;
	}

	public double getTotal() {
		return getPreco() * getQtde();
	}

	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();

		sb.append("Data: ").append(dataHora).append("\n");
		sb.append("Preco do item no pedido:").append(preco).append("\n");
		sb.append("Quantidade: ").append(qtde).append("\n");

		sb.append("Item: \n\t").append(item.listar());

		return sb;

	}
}
