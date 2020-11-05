package br.edu.univas.main;

import br.edu.univas.vo.Dialog;
import br.edu.univas.vo.Explorer;
import br.edu.univas.vo.Linux;
import br.edu.univas.vo.Mac;

public class StartApp {

	public static void main(String[] args) {
//		DialogLinuxWindow dialogLinuxWindow = new DialogLinuxWindow();
		
//		ExplorerMacWindow explorerMacWindow = new ExplorerMacWindow();
		
		Explorer explorer = new Explorer(new Mac());
		
		Dialog dialog = new Dialog(new Linux());
	}
}
