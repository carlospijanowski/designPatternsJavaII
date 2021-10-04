package br.com.seteideias.loja.imposto;

import java.math.BigDecimal;

import br.com.seteideias.loja.Orcamento;

public class ICMS {

	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
