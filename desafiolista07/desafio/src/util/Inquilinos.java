package util;

public class Inquilinos {
	private String nome;
	private String email;
	private int room;
	
	public Inquilinos(String name, String mail, int room) {
		this.nome = name;
		this.email = mail;
		this.room = room;
	}
	public void setall(String name, String mail, int room) {
		this.nome = name;
		this.email = mail;
		this.room = room;
	}
	public String getname() {
		return this.nome;
	}
	public String getmail() {
		return this.email;
	}
	public int getroom() {
		return this.room;
	}
}

