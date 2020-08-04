package br.edu.univas.factory;

import br.edu.univas.vo.Circle;
import br.edu.univas.vo.GeometricShape;
import br.edu.univas.vo.Line;
import br.edu.univas.vo.Rectangle;

public class TwoDShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(GeometricShapeType shapeType) {
		if (shapeType.equals(GeometricShapeType.CIRCLE)) {
			return new Circle();
		
		} else if (shapeType.equals(GeometricShapeType.LINE)) {
			return new Line();
			
		} else if (shapeType.equals(GeometricShapeType.RECTANGLE)) {
			return new Rectangle();
		}
		
		return null;
	}

}
