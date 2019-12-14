import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUI2 {

	private JFrame frame;
	private JTextField textField;
	private String s2;
	private int RainData;
	private int HumData;
	private int SunData;
	private int TempData;
	private int WindData;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI2 window = new GUI2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI2() {
		RainData = 10;
		HumData = 10;
		SunData = 15;
		TempData = 12;
		WindData = 10;
		Date now = new Date();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		s2 = df2.format(now);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(188, 11, 114, 20);
		textField.setText(s2);
		textField.setEditable(false);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Wind");
		btnNewButton.addActionListener(event -> {
			makeWind();
		});
		btnNewButton.setBounds(59, 42, 370, 20);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnHumidity = new JButton("Humidity");
		btnHumidity.setBounds(59, 100, 370, 20);
		btnHumidity.addActionListener(event ->{
			makeHumidity();
		});
		frame.getContentPane().add(btnHumidity);
		
		JButton btnRain = new JButton("Rain");
		btnRain.setBounds(59, 160, 370, 20);
		btnRain.addActionListener(event -> {
			makeRain();
		});
		frame.getContentPane().add(btnRain);
		
		JButton btnSun = new JButton("Sun");
		btnSun.addActionListener(event ->{
			makeSun();
		});
		btnSun.setBounds(59, 219, 370, 20);
		frame.getContentPane().add(btnSun);
		
		JButton btnTemprature = new JButton("Temperature");
		btnTemprature.addActionListener(event -> {
			makeTemp();
		});
		btnTemprature.setBounds(59, 276, 370, 20);
		frame.getContentPane().add(btnTemprature);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 327, 502, 2);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("Power Off");
		btnNewButton_1.addActionListener(event -> {
			powerOff();
		});
		btnNewButton_1.setBounds(99, 369, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Update Data");
		btnNewButton_2.addActionListener(event -> {
			updateData();
		});
		btnNewButton_2.setBounds(99, 413, 114, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel PowerLabel = new JLabel("New label");
		PowerLabel.setBounds(27, 373, 46, 14);
		frame.getContentPane().add(PowerLabel);
		
		JLabel UpdateLabel = new JLabel("New label");
		UpdateLabel.setBounds(27, 417, 46, 14);
		frame.getContentPane().add(UpdateLabel);
	}

	private void powerOff() {
		System.exit(0);
	}

	private void updateData() {
		// TODO Randomize the Data RainData, WindData, etc
		
	}

	private void makeTemp() {
		TempClass tc = new TempClass(TempData);
	}

	private void makeSun() {
		SunClass sc = new SunClass(SunData);
	}

	private void makeRain() {
		RainClass rc = new RainClass(RainData);
	}

	private void makeHumidity() {
		HumClass hc = new HumClass(HumData);
	}

	private void makeWind() {
		WindClass wc = new WindClass(WindData);
	}
}
