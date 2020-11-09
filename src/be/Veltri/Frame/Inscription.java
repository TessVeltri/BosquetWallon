package be.Veltri.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.Veltri.DAO.Connexion;
import be.Veltri.DAO.DAO;
import be.Veltri.DAO.UserDAO;
import be.Veltri.POJO.Client;
import be.Veltri.POJO.User;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inscription extends JFrame {

	private JPanel contentPane;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_rue;
	private JTextField textField_num;
	private JTextField textField_cp;
	private JTextField textField_ville;
	private JTextField textField_email;
	private JTextField textField_pwd;
	private JFrame frame = this;

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
	public Inscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_titre = new JLabel("Inscription");
		lbl_titre.setBounds(5, 5, 476, 57);
		lbl_titre.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_titre.setFont(new Font("Segoe Print", Font.BOLD, 32));
		contentPane.add(lbl_titre);
		
		JLabel lbl_discriminator = new JLabel("S'inscrire en tans que :");
		lbl_discriminator.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_discriminator.setBounds(68, 73, 197, 24);
		contentPane.add(lbl_discriminator);
		
		JComboBox cb_discri = new JComboBox();
		cb_discri.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cb_discri.setModel(new DefaultComboBoxModel(new String[] {"Client", "Organisateur", "Artiste"}));
		cb_discri.setBounds(273, 73, 135, 24);
		contentPane.add(cb_discri);
		
		JLabel lbl_nom = new JLabel("Nom : ");
		lbl_nom.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_nom.setBounds(68, 123, 74, 24);
		contentPane.add(lbl_nom);
		
		textField_nom = new JTextField();
		textField_nom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_nom.setBounds(211, 124, 197, 24);
		contentPane.add(textField_nom);
		textField_nom.setColumns(10);
		
		JLabel lbl_prenom = new JLabel("Prenom :");
		lbl_prenom.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_prenom.setBounds(68, 158, 95, 24);
		contentPane.add(lbl_prenom);
		
		textField_prenom = new JTextField();
		textField_prenom.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_prenom.setColumns(10);
		textField_prenom.setBounds(211, 159, 197, 24);
		contentPane.add(textField_prenom);
		
		JLabel lbl_rue = new JLabel("Rue : ");
		lbl_rue.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_rue.setBounds(68, 224, 74, 24);
		contentPane.add(lbl_rue);
		
		textField_rue = new JTextField();
		textField_rue.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_rue.setColumns(10);
		textField_rue.setBounds(211, 225, 197, 24);
		contentPane.add(textField_rue);
		
		JLabel lbl_num = new JLabel("Num\u00E9ro : ");
		lbl_num.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_num.setBounds(68, 259, 95, 24);
		contentPane.add(lbl_num);
		
		textField_num = new JTextField();
		textField_num.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_num.setColumns(10);
		textField_num.setBounds(211, 260, 197, 24);
		contentPane.add(textField_num);
		
		JLabel lbl_cp = new JLabel("Code Postal : ");
		lbl_cp.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_cp.setBounds(68, 294, 115, 24);
		contentPane.add(lbl_cp);
		
		textField_cp = new JTextField();
		textField_cp.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_cp.setColumns(10);
		textField_cp.setBounds(211, 295, 197, 24);
		contentPane.add(textField_cp);
		
		JLabel lbl_ville = new JLabel("Ville : ");
		lbl_ville.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_ville.setBounds(68, 329, 74, 24);
		contentPane.add(lbl_ville);
		
		textField_ville = new JTextField();
		textField_ville.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_ville.setColumns(10);
		textField_ville.setBounds(211, 330, 197, 24);
		contentPane.add(textField_ville);
		
		JLabel lbl_email = new JLabel("Email : ");
		lbl_email.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_email.setBounds(68, 400, 74, 24);
		contentPane.add(lbl_email);
		
		textField_email = new JTextField();
		textField_email.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_email.setColumns(10);
		textField_email.setBounds(211, 401, 197, 24);
		contentPane.add(textField_email);
		
		JLabel lbl_pwd = new JLabel("Mot de passe :");
		lbl_pwd.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_pwd.setBounds(68, 435, 135, 24);
		contentPane.add(lbl_pwd);
		
		textField_pwd = new JTextField();
		textField_pwd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textField_pwd.setColumns(10);
		textField_pwd.setBounds(211, 436, 197, 24);
		contentPane.add(textField_pwd);
		
		JButton btn_inscription = new JButton("INSCRIPTION");
		btn_inscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DAO<User> userDao = new UserDAO(Connexion.getInstance());
				if (cb_discri.getSelectedItem().toString().equals("Client")) {
					User user = new Client(textField_nom.getText(), textField_prenom.getText(), textField_rue.getText(),
							Integer.parseInt(textField_num.getText()), Integer.parseInt(textField_cp.getText()),
							textField_ville.getText(), textField_email.getText(), textField_pwd.getText());
					userDao.create(user);
				} else if (cb_discri.getSelectedItem().toString().equals("Organisateur")) {
					User user = new Client(textField_nom.getText(), textField_prenom.getText(), textField_rue.getText(),
							Integer.parseInt(textField_num.getText()), Integer.parseInt(textField_cp.getText()),
							textField_ville.getText(), textField_email.getText(), textField_pwd.getText());
					userDao.create(user);
				} else if (cb_discri.getSelectedItem().toString().equals("Artiste")) {
					User user = new Client(textField_nom.getText(), textField_prenom.getText(), textField_rue.getText(),
							Integer.parseInt(textField_num.getText()), Integer.parseInt(textField_cp.getText()),
							textField_ville.getText(), textField_email.getText(), textField_pwd.getText());
					userDao.create(user);
				}
				frame.setVisible(false);
				StartConnexion home = new StartConnexion();
				home.setVisible(true);
			}
		});
		btn_inscription.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_inscription.setBounds(145, 497, 181, 27);
		contentPane.add(btn_inscription);
		
		
	}
}
