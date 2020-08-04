package br.edu.univas.main;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.factory.GeometricShapeType;
import br.edu.univas.factory.ShapeType;
import br.edu.univas.vo.GeometricShape;

public class StartApp {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProvider.getFactory(ShapeType.TWO_D);
		
		//Circle circle = new Circle();
		//GeometricShape circle = new Circle();
		GeometricShape circle = factory.getShape(GeometricShapeType.CIRCLE);
		circle.draw();
		
		//Line line = new Line();
		//GeometricShape line = new Line();
		GeometricShape line = factory.getShape(GeometricShapeType.LINE);
		line.draw();
		
		GeometricShape rectangle = factory.getShape(GeometricShapeType.RECTANGLE);
		rectangle.draw();
		
		factory = FactoryProvider.getFactory(ShapeType.THREE_D);
		
		//Sphere sphere = new Sphere();
		//GeometricShape sphere = new Sphere();
		GeometricShape sphere = factory.getShape(GeometricShapeType.SPHERE);
		sphere.draw();
	}
	
}
