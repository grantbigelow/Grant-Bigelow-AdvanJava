import javax.swing.JFrame;

public class TicTacToeMain {

	public static void main(String[] args) {
		createAndShowGUI();
		

	}
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Tic Tac Toe Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TicTacToeBoard board = new TicTacToeBoard();
		frame.add(board);
		
		frame.setSize(622, 722);
		
		frame.setVisible(true);
		
	}

}
