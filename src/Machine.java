
public class Machine {
	
	private int state;
	private Tape tape;
	private Instructions instructions;
	private IOSystem IO;
	
	public Machine() {
		state = 0;
		//tape = new Tape();
	}
	
	public int getState() {
		return state;
	}
	
	public void changeState(int newState) {
		state = newState;
	}
}