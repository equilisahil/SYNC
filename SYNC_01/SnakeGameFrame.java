import javax.swing.JFrame;

public class SnakeGameFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	SnakeGameFrame() {
		SnakeGamePanel panel = new SnakeGamePanel();
		this.add(panel);
		this.setTitle("snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
