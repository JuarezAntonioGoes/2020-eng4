package br.edu.univas.main;

import br.edu.univas.bridge.vo.Blue;
import br.edu.univas.bridge.vo.Circle;
import br.edu.univas.bridge.vo.Color;
import br.edu.univas.bridge.vo.Red;
import br.edu.univas.bridge.vo.Shape;
import br.edu.univas.bridge.vo.Square;

public class BridgeStartApp {

	public static void main(String[] args) {
//		Shape redCircle = new RedCircle();
//		
//		Shape blueCircle = new BlueCircle();
//		
//		Shape redSquare = new RedSquare();
//		
//		Shape blueSquare = new BlueSquare();
		
		Color red = new Red();
		Color blue = new Blue();
		
		Shape redCircle = new Circle(red);
		
		Shape blueCircle = new Circle(blue);
		
		Shape redSquare = new Square(red);
		
		Shape blueSquare = new Square(blue);
	}
	
}
