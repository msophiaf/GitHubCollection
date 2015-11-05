import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {
	public static void main(String[] args) {
setSpeed(10);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		Tortoise.turn(90);
		Tortoise.move(100);
		
		Tortoise.turn(120);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
		Tortoise.turn(120);
		Tortoise.move(50);
		
		for(int i = 1; i<360; i++){
		Tortoise.move(1);
		Tortoise.turn(1);
		}
		
		
		

	}
}
