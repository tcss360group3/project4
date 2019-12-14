import javax.swing.JFrame;

public class WindClass extends JFrame{
	private int data;
	public WindClass(int theData) {
		data = theData;
		//TODO: Display the data in a nice way
		setTitle("Wind");
		setSize(400,400);
		setLocation(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
