package mastermind.board;

public class Key {

	private KeyColor[] feedback;

	public Key(Code secret, Code guess) {

		int keys = 0;
		int black_keys = 0;

		int[] patternColorCount = new int[CodeColor.values().length - 1];
		int[] guessColorCount = new int[CodeColor.values().length - 1];

		for (int i = 0; i < Code.CODE_SIZE; i++) {
			CodeColor subSecret = secret.getColorAt(i);
			CodeColor subGuess = guess.getColorAt(i);

			++patternColorCount[subSecret.ordinal()];
			++guessColorCount[subGuess.ordinal()];

			if (subSecret.equals(subGuess)) {
				++black_keys;
			}
		}

		for (int i = 0; i < CodeColor.values().length - 1; i++) {
			keys += Math.min(patternColorCount[i], guessColorCount[i]);
		}

		this.setFeedback(black_keys, keys - black_keys);
	}

	private void setFeedback(int black_keys, int white_keys) {
			
		feedback = new KeyColor[Code.CODE_SIZE];
		
		for (int i = 0; i < Code.CODE_SIZE; i++) {
			if(black_keys > 0) {
				this.feedback[i] = KeyColor.BLACK;
				black_keys--;
			} else if (white_keys > 0) {
				this.feedback[i] = KeyColor.WHITE;
				white_keys--;
			} else {
				this.feedback[i] = KeyColor.NULL;
			}
		}
	}

	public String write() {
		String output = "| ";

		for (int i = 0; i < Code.CODE_SIZE; i++) {
			output.concat(this.feedback[i].getColor());
			output.concat(" |");
		}
		
		for (KeyColor kc:  this.feedback) {
			output = output.concat(kc.getColor()).concat(" | ");	
		}

		return output;
	}

	public boolean isWinner() {
		Boolean winner = true;

		for (int i = 0; i < Code.CODE_SIZE; i++) {
			winner = winner && feedback[i].equals(KeyColor.BLACK);
		}

		return winner;
	}
}
