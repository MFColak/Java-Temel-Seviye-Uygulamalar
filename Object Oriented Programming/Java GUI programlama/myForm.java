package windowExp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.swt.widgets.ProgressBar;

import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToolBar;

public class myForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myForm frame = new myForm();
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
	public myForm() {
		setTitle("Pencere Bileþenimiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 189, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.WHITE);
		progressBar.setBounds(5, 401, 420, 14);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("Beni Týkla");
		btnNewButton.setBounds(204, 5, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
				textField.setText("Merhaba Java");
				progressBar.setValue(50);
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblMerhaba = new JLabel("Merhaba");
		lblMerhaba.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
			}
		});
		lblMerhaba.setBounds(321, 9, 46, 14);
		contentPane.add(lblMerhaba);
		
		
	}
}
