import javax.swing.JFrame;

public class TempClass extends JFrame{
	private int data;
	public TempClass(int theData) {
		//TODO: Display the data in a nice way
		data = theData;
		setTitle("Temp");
		setSize(400,400);
		setLocation(600,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}
