
public class SnakeGame {
	
	private String move1;
	
	
	
	public void up () {
		move1="UP";
	}
	public void down () {
		move1="DOWN";
	}

	public void right () {
		move1="RIGHT";
	}
	public void left () {
		move1="LEFT";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GameFrame();
	}

}
