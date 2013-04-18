import java.awt.*;
import javax.swing.*;

public class CrisisBox extends JFrame {
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public CrisisBox() {
		super("CrisisBox");

		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");

		setLookAndFeel();
		//setSize(348, 128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pane = new JPanel();
		BoxLayout box = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(box);

		pane.add(panicButton);
		pane.add(dontPanicButton);
		pane.add(blameButton);
		pane.add(mediaButton);
		pane.add(saveButton);
		add(pane);
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
			);
		} catch (Exception exc) {
			//ignore error
		}
	}
	public static void main(String[] arguments) {
		CrisisBox crb = new CrisisBox();
	}
}
