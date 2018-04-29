package model;

public class Comptable {
	private Long id;
	private String login;
	private String pwd;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Comptable(Long id, String login, String pwd) {
		super();
		this.id = id;
		this.login = login;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Comptable [id=" + id + ", login=" + login + ", pwd=" + pwd + "]";
	}
	
}
