import java.util.Random;

public class montehall {
	
	/*Txt pg34, #2.20 
	 *a)
	 *S = {G, D1, D2}
	 *P(G)=1/3 | P(D1)=1/3 | P(D2)=1/3
	 *So, there's a 33% chance the contestant selects the winning curtain
	 *  
	 *b)
	 *The strategy which maximizes the contestants chances of winning is to
	 *switch curtains after being shown the dud, because now the set S = {G, D}
	 *gives a 50% chance of selecting the winning curtain as opposed to the 33%
	 *chance given at the start of the game when there were 3 choices. 
	 */
	
	//adjusting global variable 'plays' will change number of plays in both cases
	static final int plays = 10000;
	Random rand = new Random();
	int wins = 0;
	//For Keeping the same door
	public double gameshow(int n) {
		for(int i=0; i<n; i++) {
			int win = rand.nextInt(3);
			int guess = rand.nextInt(3);
			if(guess == win) {
				wins += 1;
			}
		}
		return wins;
	}
	
	int wins_2;
	//For When Changing Doors
	public double gameshow_2(int n) {
		for(int i=0; i<n; i++) {
			int win = rand.nextInt(3);
			int guess = rand.nextInt(3);
			if(guess == win) {
				wins_2 += 1;
			}
			else {
				int win_2 = rand.nextInt(2);
				int guess_2 = rand.nextInt(2);
				if(guess_2 == win_2) {
					wins_2 += 1;
				}
			}
		}
		return wins_2;
	}	
	
	public static void main (String args[]) {
		montehall simulation = new montehall();
		double avg = simulation.gameshow(plays)/plays; double avg_2 = simulation.gameshow_2(plays)/plays;
		System.out.println("Average probability of winning over " + plays + " plays, when keeping your door: " + avg); 
		System.out.println("Average probability of winning over " + plays + " plays, when changing doors: " + avg_2);
	}
	
}

