import javax.swing.JFrame;

public class RainClass extends JFrame{
	private int data;
	public RainClass(int theData) {
		//TODO: Display the data in a nice way
		data = theData;
		setTitle("Rain");
		setSize(400,400);
		setLocation(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
}
