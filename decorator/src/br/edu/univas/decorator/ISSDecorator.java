package br.edu.univas.decorator;

import br.edu.univas.vo.Imposto;
import br.edu.univas.vo.Orcamento;

public class ISSDecorator extends ImpostoDecorator {

	public ISSDecorator() {
		super();
	}
	
	public ISSDecorator(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

}
