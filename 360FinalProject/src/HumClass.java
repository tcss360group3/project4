import javax.swing.JFrame;

public class HumClass extends JFrame{
	private int data;
	public HumClass(int theData) {
		//TODO: Display the data in a nice way
		data = theData;
		setTitle("Humidity");
		setSize(400,400);
		setLocation(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
