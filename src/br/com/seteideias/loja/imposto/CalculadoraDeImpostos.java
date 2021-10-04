package br.com.seteideias.loja.imposto;

import java.math.BigDecimal;

import br.com.seteideias.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
