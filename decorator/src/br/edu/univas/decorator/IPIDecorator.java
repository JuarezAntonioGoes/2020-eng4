package br.edu.univas.decorator;

import br.edu.univas.vo.Imposto;
import br.edu.univas.vo.Orcamento;

public class IPIDecorator extends ImpostoDecorator {

	public IPIDecorator() {
		super();
	}
	
	public IPIDecorator(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.15 + calculaOutroImposto(orcamento);
	}

}
