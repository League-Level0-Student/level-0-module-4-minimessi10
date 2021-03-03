package _03_char._3_pi_aloud;

import java.io.IOException;
import java.util.Scanner;

public class PiAloud {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	boolean canPlaySounds = true;
	
	
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		/*String value = "3.14159265358979323846";
		System.out.println(value.charAt(0));
		System.out.println(value.charAt(1));
		System.out.println(value.charAt(2));
		for (int i = 0; i < value.length(); i++) {
			System.out.println(value.charAt(i));
		}*/
		StringBuilder name = new StringBuilder("David");
		int lastposition = name.length()-1;
		name.deleteCharAt(lastposition);
		System.out.println(name);
		lastposition--;
		name.deleteCharAt(lastposition);
		System.out.println(name);
		name.append('e');
		System.out.println(name);
		StringBuilder oldName = new StringBuilder("David");
		if (oldName.charAt(3) != name.charAt(3)) {
			System.out.println("Dave is not my name!");
		}
	}

	// 2. Make a String variable to hold 20 digits of Pi. You could use http://www.piday.org/million/ to get this.

	// 3. Print out 3 digits of Pi. The first value is "pi.charAt(0)", the second is "pi.charAt(1)"
	// Check the console shows 3.1

	// 4. Print ALL the digits of the Pi String, putting each digit on a new line  (hint: use a loop)

	// 5. Skip this step if your computer cannot play sounds. 
	//		if (canPlaySounds) {
	//				 Use the speak() method to speak each digit of Pi.   
	//		}
	
	
	// [CHALLENGE]
	// *6. Get a character from the user using the getInputFromUser() method
	// *7. Compare the users' char to the next digit of Pi
	// *8. If they are correct, print out "correct". If they are not, print "incorrect" 
	
	
	
	/********************  Use these methods. DON'T CHANGE THE CODE BELOW  ******************/

	static void speak(char characterToSpeak) {
		
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ characterToSpeak + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + characterToSpeak).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


