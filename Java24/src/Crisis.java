import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame {
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	public Crisis() {
		super("Crisis");
		setLookAndFeel();
		setSize(348, 128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//FlowLayout flo = new FlowLayout();
		//setLayout(flo);
		//GridLayout grid = new GridLayout(2, 3);
		//setLayout(grid);
		BorderLayout crisisLayout = new BorderLayout();
		setLayout(crisisLayout);
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		/*
		add(panicButton);
		add(dontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		*/
		add(panicButton, BorderLayout.NORTH);
		add(dontPanicButton, BorderLayout.SOUTH);
		add(blameButton, BorderLayout.EAST);
		add(mediaButton, BorderLayout.WEST);
		add(saveButton, BorderLayout.CENTER);
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
		Crisis cr = new Crisis();
	}
}
