package br.edu.univas.decorator;

import br.edu.univas.vo.Imposto;
import br.edu.univas.vo.Orcamento;

public class ICMSDecorator extends ImpostoDecorator {

	public ICMSDecorator() {
		super();
	}
	
	public ICMSDecorator(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}

}
