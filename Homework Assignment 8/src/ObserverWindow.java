import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverWindow implements PropertyChangeListener {

	private JLabel label;

	// CONSTRUCTOR
	ObserverWindow() {
		JFrame frame = new JFrame("Observer Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);
	}

	// The Observer interface requires the implementation of update() abstract method
	//public void update(PropertyChangeListener p, Object data) {
		//Display the number of taps that occur on the observed window.
		//label.setText((String) data);
	//}

	public void propertyChange(PropertyChangeEvent evt, Object data) {
		// TODO Auto-generated method stub
		label.setText((String) data);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		
	}

}