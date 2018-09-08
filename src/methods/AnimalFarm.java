package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */ for (int i = 0; i < 10; i++) {
				String animal = JOptionPane.showInputDialog("What animal you want. Pick between a duck, a cow, a dog, a cat, and a llama. If you want to play every sound at once, type in wild.");
				
				if (animal.equalsIgnoreCase("dog")) {
					playWoof();
				}
				if (animal.equalsIgnoreCase("cow")) {
					playMoo();
					
				}
				if (animal.equalsIgnoreCase("llama")) {
					playLlama();
				}
				if (animal.equalsIgnoreCase("duck")) {
					playQuack();
				}
				if (animal.equalsIgnoreCase("cat")) {
					playMeow();
				}
				if (animal.equalsIgnoreCase("wild")){
					playLlama();
					playMeow();
					playMoo();
					playQuack();
					playWoof();
				}



		}
		/* 2. Make it so that the user can keep entering new animals. */
	}
	

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}
