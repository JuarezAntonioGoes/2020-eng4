package br.edu.univas.factory;

import br.edu.univas.vo.GeometricShape;

public interface AbstractFactory {

	GeometricShape getShape(GeometricShapeType shapeType);
	
}
