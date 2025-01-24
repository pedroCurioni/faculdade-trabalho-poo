package main;

import controllers.AcomodacaoController;
import exception.TipoAcomodacaoException;

public class MainTeste {
	public static void main(String[] args) {
		AcomodacaoController acomodacaoController = new AcomodacaoController();

		try {
			acomodacaoController.createTipoAcomodacao("Suite Master", 2100, 300);
			acomodacaoController.createTipoAcomodacao("Quarto Simples", 500, 70);
		} catch (TipoAcomodacaoException e) {
			System.out.println(e.getMessage());
		}

		for (String nomeTipo : acomodacaoController.getTiposAcomodacao()) {
			System.out.println(nomeTipo);
		}
	}

}
