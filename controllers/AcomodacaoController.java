package controllers;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import exception.TipoAcomodacaoException;
import model.Acomodacao;
import model.TipoAcomodacao;

public class AcomodacaoController {
	private Map<String, TipoAcomodacao> tipos;
	private Map<Integer, Acomodacao> acomodacoes;

	public AcomodacaoController() {
		tipos = new TreeMap<>();
		acomodacoes = new TreeMap<>();
	}

	public void createTipoAcomodacao(String nome, double tarifaDiaria, double adicionalAcompanhante)
			throws TipoAcomodacaoException {
		if (tipos.containsKey(nome)) {
			throw new TipoAcomodacaoException("Já existe um tipo com o nome" + nome);
		}

		TipoAcomodacao tipo = new TipoAcomodacao(nome, tarifaDiaria, adicionalAcompanhante);
		tipos.put(tipo.getNome(), tipo);
	}

	public TipoAcomodacao getTipoAcomodacao(String nome) throws TipoAcomodacaoException {
		TipoAcomodacao tipo = tipos.get(nome);

		if (tipo == null) {
			throw new TipoAcomodacaoException("Não foi encontrado uma eceção com o nome" + nome);
		}
		return tipo;
	}

	public Set<String> getTiposAcomodacao() {
		return tipos.keySet();
	}
}
