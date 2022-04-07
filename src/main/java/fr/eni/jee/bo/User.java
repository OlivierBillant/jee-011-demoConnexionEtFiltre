package fr.eni.jee.bo;

/**
 * Entité qui va contenir un utilisateur de notre application
 */
public class User {
	
	/*
	 * Attributs
	 */
	private String username;
	private String password;
	private boolean admin;

	
	/*
	 * Constructeur
	 */
	public User(String username, String password, boolean admin) {
		super();
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	
	

	/*
	 * GETTERS / SETTERS
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
}
