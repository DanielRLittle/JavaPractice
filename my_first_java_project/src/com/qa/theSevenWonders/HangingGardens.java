package com.qa.theSevenWonders;

public class HangingGardens extends Wonder{
	public void displayWonder() {
		System.out.println("              _~_~_~_");
		System.out.println("          [O]{  [O]  }[O]");
		System.out.println("         _~|_{___|___}_|~_");
		System.out.println("        {   [O] [_] [O]   }");
		System.out.println("     _~~{____|__|||__|____}~~_");
		System.out.println("[O] |    [O]    |||    [O]    | [O]");
		System.out.println("_|__|_____|_____|||_____|_____|__|_");
	}
	public static void main(String[] args) {
		HangingGardens g = new HangingGardens();
		g.displayWonder();
	}
}
