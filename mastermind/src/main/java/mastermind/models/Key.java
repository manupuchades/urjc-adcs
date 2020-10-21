package mastermind.models;

public class Key {

	private KeyColor[] feedback;

	public Key(Code secret, Code guess) {

		int keys = 0;
		int blackKeys = 0;

		int[] patternColorCount = new int[CodeColor.values().length - 1];
		int[] guessColorCount = new int[CodeColor.values().length - 1];

		for (int i = 0; i < Code.CODE_SIZE; i++) {
			CodeColor subSecret = secret.getColorAt(i);
			CodeColor subGuess = guess.getColorAt(i);

			++patternColorCount[subSecret.ordinal()];
			++guessColorCount[subGuess.ordinal()];

			if (subSecret.equals(subGuess)) {
				++blackKeys;
			}
		}

		for (int i = 0; i < CodeColor.values().length - 1; i++) {
			keys += Math.min(patternColorCount[i], guessColorCount[i]);
		}

		this.setFeedback(blackKeys, keys - blackKeys);
	}

	private void setFeedback(int blackKeys, int whiteKeys) {
				
		feedback = new KeyColor[Code.CODE_SIZE];
		
		for (int i = 0; i < Code.CODE_SIZE; i++) {
			if(blackKeys > 0) {
				this.feedback[i] = KeyColor.BLACK;
				blackKeys--;
			} else if (whiteKeys > 0) {
				this.feedback[i] = KeyColor.WHITE;
				whiteKeys--;
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

	public boolean isAllBlack() {
		Boolean isAllBlack = true;
		
		for (int i = 0; i < Code.CODE_SIZE; i++) {
			isAllBlack = isAllBlack && feedback[i].equals(KeyColor.BLACK);
		}
		return isAllBlack;
	}
}
