import javax.swing.JFrame;

public class SunClass extends JFrame{
	private int data;
	public SunClass(int theData) {
		//TODO: Display the data in a nice way
		data = theData;
		setTitle("Sun");
		setSize(400,400);
		setLocation(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
