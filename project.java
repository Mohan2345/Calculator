package demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class project extends JFrame {

	private JPanel result;
	private JTextField textnum1;
	private JTextField textnum2;
	private JTextField textres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project frame = new project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public project() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 487);
		result = new JPanel();
		result.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(result);
		result.setLayout(null);
		
		textnum1 = new JTextField();
		textnum1.setBounds(153, 34, 147, 42);
		result.add(textnum1);
		textnum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Number1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(38, 19, 82, 66);
		result.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Number2");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(38, 114, 82, 48);
		result.add(lblNewLabel);
		
		textnum2 = new JTextField();
		textnum2.setBounds(153, 120, 147, 42);
		result.add(textnum2);
		textnum2.setColumns(10);
		
		JLabel reslbl = new JLabel(" Result");
		reslbl.setFont(new Font("Tahoma", Font.PLAIN, 16));
		reslbl.setHorizontalAlignment(SwingConstants.CENTER);
		reslbl.setBounds(10, 194, 105, 54);
		result.add(reslbl);
		
		textres = new JTextField();
		textres.setBounds(153, 195, 147, 42);
		result.add(textres);
		textres.setColumns(10);
		
		JButton btnadd = new JButton(" ADD(+)");
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textnum1.getText());
				int b = Integer.parseInt(textnum2.getText());
				
				textres.setText(Integer.toString(a+b));
			}
		});
		btnadd.setBounds(38, 285, 105, 21);
		result.add(btnadd);
		
		JButton btnSub = new JButton("SUB(-)");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textnum1.getText());
				int b = Integer.parseInt(textnum2.getText());
				
				textres.setText(Integer.toString(a-b));
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.setBounds(153, 285, 96, 21);
		result.add(btnSub);
		
		JButton btnMul = new JButton("MUL(*)");
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textnum1.getText());
				int b = Integer.parseInt(textnum2.getText());
				
				textres.setText(Integer.toString(a*b));
			}
		});
		btnMul.setBounds(275, 285, 107, 21);
		result.add(btnMul);
		
		JButton btnDiv = new JButton("DIV(\\)");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textnum1.getText());
				int b = Integer.parseInt(textnum2.getText());
				
				textres.setText(Double.toString(a/b));
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.setBounds(392, 285, 105, 21);
		result.add(btnDiv);
	}
}
