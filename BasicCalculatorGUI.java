import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculaor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField input;
	public double answer,number;
	public int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculaor frame = new Calculaor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	
	public void calculate() {
		switch(operation) {
		
		case 1: 
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4: 
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
		}
	}
	
	/**
	 * Create the frame.
	 */
	public Calculaor() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 639);
		getContentPane().setLayout(null);
		
		JPanel Screen = new JPanel();
		Screen.setBounds(10, 10, 448, 107);
		getContentPane().add(Screen);
		Screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setForeground(new Color(0, 0, 0));
		input.setBackground(new Color(255, 255, 255));
		input.setFont(new Font("Times New Roman", Font.BOLD, 30));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBounds(0, 36, 446, 68);
		Screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(0, 0, 446, 26);
		Screen.add(lbl);
		
		JPanel Control = new JPanel();
		Control.setBounds(10, 127, 448, 465);
		getContentPane().add(Control);
		Control.setLayout(new GridLayout(4, 4, 20, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_2);
		
		JButton btnNewButton_18 = new JButton("+");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_18.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_18);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_9);
		
		JButton btnNewButton_17 = new JButton("1");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_17);
		
		JButton btnNewButton_16 = new JButton("*");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_16);
		
		JButton btnNewButton_15 = new JButton("0");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_15);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText(" ");
			}
		});
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_14);
		
		JButton btnNewButton_13 = new JButton("c");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_13);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText(" ");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_19.setFont(new Font("Times New Roman", Font.BOLD, 40));
		Control.add(btnNewButton_19);

	}
}
