package br.edu.univas.factory;

import br.edu.univas.vo.GeometricShape;
import br.edu.univas.vo.Sphere;

public class ThreeDShapeFactory implements AbstractFactory {

	@Override
	public GeometricShape getShape(GeometricShapeType shapeType) {
		if (shapeType.equals(GeometricShapeType.SPHERE)) {
			return new Sphere();
		}
		
		return null;
	}

}
