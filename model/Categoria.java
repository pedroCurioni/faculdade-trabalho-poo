package model;

import java.util.ArrayList;

public class Categoria {
	private final String nome;
	private final ArrayList<Item> itens;

	public Categoria(String nome) {
		super();
		this.nome = nome;
		this.itens = new ArrayList<Item>();
	}

	public String getNome() {
		return nome;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void addItem(Item item) {
		itens.add(item);
	}

}
