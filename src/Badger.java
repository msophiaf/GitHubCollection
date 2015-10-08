import java.util.concurrent.TimeUnit;


public class Badger {

	public static void main(String[] args) {
		
	for(int j = 0; j < 2; j++){	
			
		for(int i = 0; i < 4; i++){	
	speak("Badger");
	
			}
		for(int i = 0; i < 2; i++){	
			speak("mushroom");
		}
			for(int i = 0; i < 4; i++){	
	speak("snake");}
	}}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
