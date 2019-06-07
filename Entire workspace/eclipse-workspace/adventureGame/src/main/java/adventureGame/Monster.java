package adventureGame;

import java.util.Random;

public class Monster extends Characters{


	
	public Monster(float horizontal, float vertical) {
		super(horizontal, vertical);
	}
	
	public void move() {
		Game.distCalc();
			
	}

	
	public void setHorizontal() {
		Random r = new Random();
		float t = r.nextFloat()*70;
		float u = Game.player.getHorizontal();
		int v = r.nextInt(2);
		if (v == 0) {
			float s = u + t + 30;
			this.horizontal = s;
		}
		else {
			float s = u - t - 30;
			this.horizontal = s;
		}
		Game.distance = 0;

	}
	public void setVertical() {
		Random r = new Random();
		float t = r.nextFloat()*70;
		float u = Game.player.getVertical();
		int v = r.nextInt(2);
		if (v == 0) {
			float s = u + t + 30;
			this.vertical = s;
		}
		else {
			float s = u - t - 30;
			this.vertical = s;
		}
		Game.distance = 0;
	}

	public int hit() {
		Game.player.health -= 40;
		System.out.println("A monster comes out of the fog and hits you, health = " + Game.player.health);
		if (Game.player.health == 0) {
			System.out.println("You die!");
		}
		Game.monster.setVertical();
		Game.monster.setHorizontal();
		return Game.player.health;
		
	}


	
}
