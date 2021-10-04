package br.com.seteideias.loja.imposto;

import java.math.BigDecimal;

import br.com.seteideias.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
