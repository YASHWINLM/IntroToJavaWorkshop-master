package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("spell timbuktu");
		// 2. Catch the user's answer in a String
		String answer= JOptionPane.showInputDialog(null, "INPUT ANSWER");
		// 3. If the user spelled the word correctly, speak "correct"
		if(answer.equals ("timbuktu"))
		{
		speak("CCCCCCOOOOOORRRRRREEEEEECCCCCCTTTTTT");	
		}
		// 4. Otherwise say "wrong"
		else{
			speak("U FAILED!!,NOOB, SCRUBB, YOU NEED TO GET SOME SMARTS, U FAILIURE AT LIFE, YOU WILL NEVER BE A BOSS, JUST GIVE UP ON LIFE!!!"
					+ "");
		}
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


