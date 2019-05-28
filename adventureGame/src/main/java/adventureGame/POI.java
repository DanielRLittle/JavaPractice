package adventureGame;

public class POI {
//Stands for Point of Interest

	public POI() {
		
	}

	public void letter() {
		System.out.println("*You find a soggy letter floating at the top of the murky water, press enter to read*");
		Game.w8();
//		int space = 48;
//		int size = Game.player.getName().length();
//		space -= size;
//		String nameLine = "     "+Game.player.getName();
//		for (int i = 0; i < space; i++) {
//			nameLine = nameLine + " ";
//		}
//		Game.player.getName().trim();
//		max 8 characters for name
		
		System.out.println("  _____________________________________________________");
		System.out.println(" |                                                     |");
//		System.out.println(nameLine);
		System.out.println(" |     "+Game.player.getName());
		System.out.println(" |                                                     |");
		System.out.println(" |      If you are reading this my friend, then we     |");
		System.out.println(" |      are truly blessed. You fell unconcious and     |");
		System.out.println(" |      we had no choice but to leave you.             |");
		System.out.println(" |          We were being followed, and if you are     |");
		System.out.println(" |      still alive, you are likely still a target.    |");
		System.out.println(" |      I cannot say what is watching you, or          |");
		System.out.println(" |      whether it is even a fret, but best stay on    |");
		System.out.println(" |      the side of caution.                           |");
		System.out.println(" |          Do not fear however. Once we can track     |");
		System.out.println(" |      your exact location we can come back via       |");
		System.out.println(" |      helicopter and pick you up. Try and stay       |");
		System.out.println(" |      safe my friend, I hope to see you again        |");
		System.out.println(" |      soon...                                        |");
		System.out.println(" |                Your Dear Friend                     |");
		System.out.println(" |                      Jerry                          |");
		System.out.println(" |                                                     |");
		System.out.println(" |                                                     |");
		System.out.println(" |                                                     |");
		System.out.println(" |_____________________________________________________|");
	}
	
	public void heal() {
		System.out.println("You have found a health potion and drank");
		Game.player.setHealth(120);
	}
}
