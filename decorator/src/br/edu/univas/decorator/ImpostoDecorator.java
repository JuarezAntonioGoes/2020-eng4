package br.edu.univas.decorator;

import br.edu.univas.vo.Imposto;
import br.edu.univas.vo.Orcamento;

public abstract class ImpostoDecorator implements Imposto {

	private Imposto outroImposto;
	
	public ImpostoDecorator() {
		super();
	}
	
	public ImpostoDecorator(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	@Override
	public abstract double calculaImposto(Orcamento orcamento);
	
	protected double calculaOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0.0;
		}
		return outroImposto.calculaImposto(orcamento);
	}

}
