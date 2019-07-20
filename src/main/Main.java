package main;

import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Random rand = new Random();
		
		int screenWidth = (int) screenSize.getWidth();
		int screenHeight = (int) screenSize.getHeight();
		int ranWidth, ranHeight;
		
		int timer = 10000;
		while(true) {
			ranWidth = rand.nextInt(screenWidth);
			ranHeight = rand.nextInt(screenHeight);
			
			JOptionPane pane = new JOptionPane("Go to Sleep!", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_OPTION);
			JDialog dialog = pane.createDialog(null, "SLEEEP!");
			
			dialog.setLocation(ranWidth, ranHeight);
			dialog.setModalityType(ModalityType.MODELESS);
			dialog.setAlwaysOnTop(true);
			dialog.setVisible(true);

			try {
				Thread.sleep(timer);
				if(timer != 250) timer -= 250;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
