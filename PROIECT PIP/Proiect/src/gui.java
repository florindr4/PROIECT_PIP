import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolTip;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class gui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
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
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Plagiarism detection application");
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOAD");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(535, 38, 129, 52);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setToolTipText("Select project to be analysed");
		
		
		JLabel lblNewLabel = new JLabel("Database");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(24, 146, 153, 100);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(260, 38, 224, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setToolTipText("Path to project");
		
		
		JLabel lblNewLabel_1 = new JLabel("Project to analyse");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(24, 10, 215, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(260, 176, 224, 52);
		frame.getContentPane().add(textField_1);
		textField_1.setToolTipText("Path to database");
		
		JButton btnNewButton_1 = new JButton("LOAD");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(535, 176, 129, 52);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setToolTipText("Select DB to be overwritten");
		
		JButton btnProjectAnalysis = new JButton("Project Analysis");
		btnProjectAnalysis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnProjectAnalysis.setBounds(72, 300, 208, 71);
		frame.getContentPane().add(btnProjectAnalysis);
		btnProjectAnalysis.setToolTipText("Execute analysis");
		
		JButton btnDatabaseExport = new JButton("Database Export (.xlsx)");
		btnDatabaseExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDatabaseExport.setToolTipText("Execute export");
		btnDatabaseExport.setBounds(467, 300, 208, 71);
		frame.getContentPane().add(btnDatabaseExport);
	}
}
