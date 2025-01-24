package model;

import java.util.ArrayList;
import java.util.Date;

public class Conta implements IConta {
	private ArrayList<ItemConta> itens;

	public Conta() {
		this.itens = new ArrayList<ItemConta>();
	}

	@Override
	public void addItem(Item item, int qtde) {
		ItemConta ic = new ItemConta(new Date(), item.getPreco(), qtde, item);
		itens.add(ic);

	}

	@Override
	public void removeItem(int index) {
		itens.remove(index);
	}

	@Override
	public double getTotal() {
		double total = 0;

		for (ItemConta itemConta : itens) {
			total += (itemConta.getPreco() * itemConta.getQtde());
		}

		return total;
	}

	@Override
	public StringBuilder listar() {
		StringBuilder sb = new StringBuilder();

		for (ItemConta itemConta : itens) {
			sb.append("\n").append(itemConta.listar()).append("\n");
		}

		return sb;
	}

}
