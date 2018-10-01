package random;

import java.net.URI;

import javax.swing.JOptionPane;

public class GoogleBirthdaySurpriseSpinner {
public static void main(String[] args) {
	// 1. Adjust this pop-up to find out what mood the user is in.
			int spin = JOptionPane.showOptionDialog(null, "Pick a number.", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "6", " 5", "4", "3", "2", "1","0" }, null);
			
			// 2. Their answer is stored in the userMood variable. Print it out.
			System.out.println(spin);
			// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
			if (spin==0) {
				playVideo("https://www.google.com/logos/2015/beethoven15/beethoven15.html");
			}
			if (spin==1) {
				playVideo("https://www.google.com/search?q=pacman&oq=pacman&aqs=chrome..69i57j0l5.2455j1j7&sourceid=chrome&ie=UTF-8#clb=clb");
			}
			if (spin==2) {
				playVideo("https://www.google.com/logos/2016/halloween16/halloween16.html");
			}
			if (spin==3) {
				playVideo("https://www.google.com/search?ei=3UqwW5mtDJLB7gKZwYuYDA&q=snake+game&oq=snake+game&gs_l=psy-ab.3..0j0i131j0l8.2533.3718..3927...0.0..0.73.340.5....2..0....1..gws-wiz.......0i71j0i67j0i10i67.-NaKTKOUZAU");
			}

			if (spin==4) {
				playVideo("https://www.google.com/logos/2013/bday13/bday13.html");
			}

			if (spin==5) {
				playVideo("https://www.google.com/logos/2017/cricket17/cricket17.html");
			}

			if (spin==6) {
				playVideo("https://beinternetawesome.withgoogle.com/en/interland/landing/kind-kingdom");
			}
			
			// 4. Play different songs for other moods.

	/**
	* If you can’t think of any, here are some you can use...
	*	http://bit.ly/video-for-happy
	*	http://bit.ly/video-for-sad
	*	http://bit.ly/video-for-angry
	**/
			
			// If you are seeing ads at the beginning of your videos, install Adblock.

		}

		static void playVideo(String youTubeLink) {
			try {
				URI uri = new URI(youTubeLink);
				java.awt.Desktop.getDesktop().browse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}







