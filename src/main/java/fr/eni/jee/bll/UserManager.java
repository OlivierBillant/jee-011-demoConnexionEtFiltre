package fr.eni.jee.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.jee.bo.User;

/**
 * Classe charger de gérer nos utilisateurs
 * TODO : rajouter une couche DAO pour stocker les utilisateurs dans une base de donnée
 */
public class UserManager {
	
	private List<User> utilisateurs = new ArrayList<User>();

	/**
	 * On initialise la liste des utilisateurs de l'application dans le constructeur
	 */
	public UserManager() {
		User user1 = new User("cyril", "Pa$$w0rd", false); // idéalement il faudrait crypter le mot de passe
		User user2 = new User("admin", "Pa$$w0rd", true); // idéalement il faudrait crypter le mot de passe
		
		utilisateurs.add(user1);
		utilisateurs.add(user2);
		
	}

	/**
	 * findByUsernameAndPassword()
	 * cherche si un utilisateur correspond au username/password donnée en paramètre
	 * si non trouvé, retourne null
	 */
	public User findByUsernameAndPassword(String username, String password) {
		for (User user : utilisateurs) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null; // on retourne null si non trouvé
	}
}
