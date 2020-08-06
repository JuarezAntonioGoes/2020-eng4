package br.edu.univas.main;

import br.edu.univas.factory.AbstractFactory;
import br.edu.univas.factory.FactoryProvider;
import br.edu.univas.vo.Button;
import br.edu.univas.vo.CheckBox;

public class StartApp {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		
		AbstractFactory factory = FactoryProvider.getFactory(osName);
		
		Button button = factory.createButton();
		button.paint();
		
		CheckBox checkBox = factory.createCheckBox();
		checkBox.paint();
		
//		if (osName.contains("windows")) {
//			WindowsButton button = new WindowsButton();
//			button.paint();
//			
//			WindowsCheckBox checkBox = new WindowsCheckBox();
//			checkBox.paint();
//			
//		} else if (osName.contains("mac")) {
//			MacButton button = new MacButton();
//			button.paint();
//			
//			MacCheckBox checkBox = new MacCheckBox();
//			checkBox.paint();
//		} 
	}
}
