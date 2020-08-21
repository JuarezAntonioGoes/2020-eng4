package br.edu.univas.main;

import br.edu.univas.vo.Circle;
import br.edu.univas.vo.Container;
import br.edu.univas.vo.Rectangle;
import br.edu.univas.vo.Square;

public class StartApp {

	public static void main(String[] args) {
		Container container = new Container();
		Circle c = new Circle();
		container.addComponent(c);
		
		Square s = new Square();
		container.addComponent(s);
		
		Rectangle r = new Rectangle();
		container.addComponent(r);
		
		Container container2 = new Container();
		container2.addComponent(new Rectangle());
		
		Container container3 = new Container();
		container3.addComponent(new Circle());
		container2.addComponent(container3);
		container.addComponent(container2);
		
		container.draw();
	}
}
