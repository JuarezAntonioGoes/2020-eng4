package br.edu.univas.vo;

public abstract class ChristmasTreeDecorator implements ChristmasTree {

	private ChristmasTree christmasTree;
	
	public ChristmasTreeDecorator() {
		super();
	}
	
	public ChristmasTreeDecorator(ChristmasTree christmasTree) {
		this.christmasTree = christmasTree;
	}
	
	@Override
	public abstract String decorate();

	protected String outroDecorate() {
		if (christmasTree == null) {
			return "";
		}
		return christmasTree.decorate();
	}
}
