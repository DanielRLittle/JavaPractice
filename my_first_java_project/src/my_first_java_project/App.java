package my_first_java_project;

public class App {
	static int temp = 40;
	public static void main(String[] args) {
		
		System.out.println(temperature(temp));
		int newtemp = 13;
		System.out.println(temperature(newtemp));
		
		
	}
	public static String temperature(int tempy) {
		if (tempy>30) {
			return "it's hot";
		}
		else if (tempy<10) {
			return "it's cold";
		}
		else {
			return "Just right";
		}
	}
}