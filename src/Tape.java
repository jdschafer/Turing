
public class Tape {
	
	int currentChar, location;
	public final int MAXSIZE = 2000;
	private final int OFFTAPE = -1;
	int[] tapeArray;
	
	public Tape(String startingTape) {
		tapeArray = new int[MAXSIZE + 2];
		tapeArray[0] = OFFTAPE;
		tapeArray[tapeArray.length - 1] = OFFTAPE;
		for(int i = 1; i < tapeArray.length -1; i++) {
			tapeArray[i] = startingTape.charAt(i-1);
		}
		location = 1000;
	}
	
	public int getCurrentChar() {
		return currentChar;
	}
	
	public int getCharAt(int loc) {
		return tapeArray[loc];
	}
	
	public void move(int dir) {
		location = location + dir;
	}
	
	public void changeChar(int newChar) {
		tapeArray[location] = newChar;
	}
}