package be.Veltri.Frame;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.Veltri.DAO.*;
import be.Veltri.POJO.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class StartConnexion extends JFrame {

	private JPanel contentPane;
	private JTextField textField_email;
	private JFrame frame = this;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartConnexion frame = new StartConnexion();
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
	public StartConnexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titre = new JLabel("Bosquet Wallon");
		lbl_titre.setBounds(10, 33, 676, 57);
		lbl_titre.setFont(new Font("Segoe Print", Font.BOLD, 32));
		lbl_titre.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl_titre);
		
		JLabel lbl__email = new JLabel("Adresse email :");
		lbl__email.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl__email.setBounds(172, 145, 126, 38);
		contentPane.add(lbl__email);
		
		JLabel lbl_pwd = new JLabel("Mot de passe : ");
		lbl_pwd.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_pwd.setBounds(172, 194, 126, 38);
		contentPane.add(lbl_pwd);
		
		textField_email = new JTextField();
		textField_email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_email.setBounds(309, 153, 211, 27);
		contentPane.add(textField_email);
		textField_email.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(308, 202, 212, 27);
		contentPane.add(passwordField);
		
		JButton btn_connexion = new JButton("CONNEXION");
		btn_connexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO<User> userDao = new UserDAO(Connexion.getInstance());
				User user = new User ();
				String password = String.valueOf(passwordField.getPassword());
				user = userDao.find(textField_email.getText(), password);
				if(user.getClass().getSimpleName().equals("User")) {
					JOptionPane.showMessageDialog(null, "Identifiant ou mot de passe incorrecte");
				}
				else {
					frame.dispose();
					Menu menu = new Menu(user);
					menu.setVisible(true);
				}
			}
		});
		btn_connexion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_connexion.setBounds(261, 283, 181, 27);
		contentPane.add(btn_connexion);
		
		JButton btn_inscription = new JButton("INSCRIPTION");
		btn_inscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Inscription inscri = new Inscription();
				inscri.setVisible(true);
			}
		});
		btn_inscription.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_inscription.setBounds(261, 337, 181, 27);
		contentPane.add(btn_inscription);
		
		
	}
}
