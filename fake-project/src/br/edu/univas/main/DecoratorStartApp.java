package br.edu.univas.main;

import br.edu.univas.decorator.ICMSDecorator;
import br.edu.univas.decorator.IPIDecorator;
import br.edu.univas.decorator.ISSDecorator;
import br.edu.univas.decorator.ImpostoDecorator;
import br.edu.univas.vo.ICMS;
import br.edu.univas.vo.IPI;
import br.edu.univas.vo.ISS;
import br.edu.univas.vo.Imposto;
import br.edu.univas.vo.Orcamento;

public class DecoratorStartApp {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);
		
//		Imposto ipi = new IPI();
//		double valorIpi = ipi.calculaImposto(orcamento);
//		System.out.println(valorIpi);
//		
//		Imposto iss = new ISS();
//		double valorIss = iss.calculaImposto(orcamento);
//		System.out.println(valorIss);
//		
//		Imposto icms = new ICMS();
//		double valorIcms = icms.calculaImposto(orcamento);
//		System.out.println(valorIcms);
//		
//		System.out.print("Valor total dos impostos:");
//		System.out.println(valorIpi + valorIss + valorIcms); //225.0
		
		
		ImpostoDecorator imposto = new IPIDecorator(
				new ISSDecorator(new ICMSDecorator()));
		
		System.out.println(imposto.calculaImposto(orcamento));
		
		imposto = new ICMSDecorator(new IPIDecorator());
		System.out.println(imposto.calculaImposto(orcamento));
		
		imposto = new ICMSDecorator(new ISSDecorator());
		System.out.println(imposto.calculaImposto(orcamento));
	}
	
}
