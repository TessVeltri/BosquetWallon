package be.Veltri.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import be.Veltri.POJO.Artistes;
import be.Veltri.POJO.Client;
import be.Veltri.POJO.Gestionnaire;
import be.Veltri.POJO.Organisateur;
import be.Veltri.POJO.User;

public class UserDAO extends DAO<User> {
	public UserDAO(Connection conn) {
		super(conn);
	}

	@Override
	public boolean create(User obj) {	
		try {
			this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeUpdate(
					"INSERT INTO User(Nom,Prenom,Rue,Numero,CodePostal,Ville,Email,Password, Discriminator) VALUES('" + obj.getNom() 
					+ "','" + obj.getPrenom()+"','"+obj.getRue()+"',"+ obj.getNum()+","+obj.getCp()+",'" + obj.getVille() 
					+ "','" + obj.getEmail() + "','" + obj.getPassword() + "','" + obj.getClass().getSimpleName().toString() +"')");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User find(String mail, String pwd) {
		User user = new User ();
		try {
			ResultSet resultset = this.connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
					.executeQuery("SELECT * FROM User WHERE Email LIKE '" + mail + "' AND Password LIKE '" + pwd + "'");
			if(resultset.first()) {
				String type = resultset.getString("Discriminator");
				switch (type) {
				case "Client":
					user = new Client(resultset.getString("Nom"), resultset.getString("Prenom"),
							resultset.getString("Rue"), resultset.getInt("Numero"), resultset.getInt("CodePostal"),
							resultset.getString("Ville"), resultset.getString("Email"),
							resultset.getString("Password"));
					break;
				case "Organisateur":
					user = new Organisateur(resultset.getString("Nom"), resultset.getString("Prenom"),
							resultset.getString("Rue"), resultset.getInt("Numero"), resultset.getInt("CodePostal"),
							resultset.getString("Ville"), resultset.getString("Email"),
							resultset.getString("Password"));
					break;
				case "Artistes":
					user = new Artistes(resultset.getString("Nom"), resultset.getString("Prenom"),
							resultset.getString("Rue"), resultset.getInt("Numero"), resultset.getInt("CodePostal"),
							resultset.getString("Ville"), resultset.getString("Email"),
							resultset.getString("Password"));
					break;
				case "Gestionnaire":
					user = new Gestionnaire(resultset.getString("Nom"), resultset.getString("Prenom"),
							resultset.getString("Rue"), resultset.getInt("Numero"), resultset.getInt("CodePostal"),
							resultset.getString("Ville"), resultset.getString("Email"),
							resultset.getString("Password"));
					break;
				}
				System.out.println(user.getClass());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
