import javax.swing.*;
import java.awt.*;

public class Playback extends JFrame {
	
	public Playback() {
		super("Playback");
		setLookAndFeel();
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		/*
		JButton play = new JButton("play");
		JButton stop = new JButton("stop");
		JButton pause = new JButton("pause");
		JLabel pageLabel = new JLabel(" Web page address: ", JLabel.RIGHT);
		JTextField pageAddress = new JTextField(20);
		JCheckBox jumboSize = new JCheckBox("Jumbo Size");
		add(play);
		add(stop);
		add(pause);
		add(pageLabel);
		add(pageAddress);
		add(jumboSize);
		*/
		
		/*
		JCheckBox jumboSize = new JCheckBox("Jumbo Size");
		JCheckBox frogLegs = new JCheckBox("Frog Leg Grande", true);
		JCheckBox fishTacos = new JCheckBox("Fish Taco Platter", false);
		JCheckBox emuNuggets = new JCheckBox("Emu Nuggets", false);
		//FlowLayout flo = new FlowLayout();
		ButtonGroup meals = new ButtonGroup();
		meals.add(frogLegs);
		meals.add(fishTacos);
		meals.add(emuNuggets);
		//setLayout(flo);
		add(jumboSize);
		add(frogLegs);
		add(fishTacos);
		add(emuNuggets);
		*/
		
		/*
		JComboBox profession = new JComboBox();
		//FlowLayout flo = new FlowLayout();
		profession.addItem("Butcher");
		profession.addItem("Baker");
		profession.addItem("Candlestick maker");
		profession.addItem("Fletcher");
		profession.addItem("Fighter");
		profession.addItem("Technical writer");
		//setLayout(flo);
		add(profession);
		*/
		
		/*
		JTextArea comments = new JTextArea(8, 40);
		//FlowLayout flo = new FlowLayout();
		//setLayout(flo);
		add(comments);
		*/
		
		/**/
		JPanel topRow = new JPanel();
		JTextArea comments = new JTextArea(8, 40);
		topRow.add(comments);
		//FlowLayout flo = new FlowLayout();
		//setLayout( flo);
		add( topRow);
		/**/

		setVisible(true);		
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch (Exception exc) {
			//ignore error
		}
	}

	public static void main(String[] args) {
		Playback pb = new Playback();
	}
}
