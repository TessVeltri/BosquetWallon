package be.Veltri.Frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JCalendar;

import be.Veltri.POJO.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
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
	public Menu(User user) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_bienvenue = new JLabel("Bienvenue");
		lbl_bienvenue.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_bienvenue.setBounds(217, 63, 91, 32);
		contentPane.add(lbl_bienvenue);
		
		JLabel lbl_nom = new JLabel(user.getNom() + " " + user.getPrenom());
		lbl_nom.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lbl_nom.setBounds(311, 63, 215, 32);
		contentPane.add(lbl_nom);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(63, 124, 317, 227);
		contentPane.add(calendar);
		
		JButton btn_deco = new JButton("DECONNEXION");
		btn_deco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				StartConnexion home = new StartConnexion();
				home.setVisible(true);
			}
		});
		btn_deco.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btn_deco.setBounds(481, 346, 149, 23);
		contentPane.add(btn_deco);
	}
}
