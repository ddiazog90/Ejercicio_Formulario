package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.logic_formPerson;

import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTable;

public class view_formPerson extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txt_name;
	public JTextField txt_dni;
	public JTextField txt_email;
	public JSpinner sp_age;
	public JButton btn_save;
	public JButton btn_clean;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_formPerson frame = new view_formPerson();
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
	public view_formPerson() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 732, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn_form = new JPanel();
		pn_form.setBackground(SystemColor.textHighlight);
		pn_form.setBounds(0, 10, 680, 263);
		contentPane.add(pn_form);
		pn_form.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBounds(38, 34, 75, 13);
		pn_form.add(lblNewLabel);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdad.setForeground(SystemColor.text);
		lblEdad.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblEdad.setBounds(38, 71, 75, 13);
		pn_form.add(lblEdad);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCedula.setForeground(SystemColor.text);
		lblCedula.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblCedula.setBounds(38, 111, 75, 13);
		pn_form.add(lblCedula);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setForeground(SystemColor.text);
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblEmail.setBounds(38, 152, 75, 13);
		pn_form.add(lblEmail);
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txt_name.setBounds(124, 28, 203, 19);
		pn_form.add(txt_name);
		txt_name.setColumns(10);
		
		txt_dni = new JTextField();
		txt_dni.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txt_dni.setColumns(10);
		txt_dni.setBounds(124, 105, 203, 19);
		pn_form.add(txt_dni);
		
		txt_email = new JTextField();
		txt_email.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		txt_email.setColumns(10);
		txt_email.setBounds(123, 146, 203, 19);
		pn_form.add(txt_email);
		
		sp_age = new JSpinner();
		sp_age.setBounds(123, 65, 54, 20);
		pn_form.add(sp_age);
		
		JLabel lblAos = new JLabel("años");
		lblAos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAos.setForeground(SystemColor.text);
		lblAos.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblAos.setBounds(182, 71, 75, 13);
		pn_form.add(lblAos);
		
		btn_save = new JButton("GUARDAR");
		btn_save.setBackground(SystemColor.controlText);
		btn_save.setForeground(SystemColor.text);
		btn_save.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btn_save.setBounds(109, 190, 100, 21);
		pn_form.add(btn_save);
		
		btn_clean = new JButton("LIMPIAR");
		btn_clean.setForeground(SystemColor.text);
		btn_clean.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btn_clean.setBackground(SystemColor.controlText);
		btn_clean.setBounds(219, 190, 100, 21);
		pn_form.add(btn_clean);
		
		table = new JTable();
		table.setBounds(353, 35, 304, 187);
		pn_form.add(table);
		
		
		new logic_formPerson(this);
	}
}
