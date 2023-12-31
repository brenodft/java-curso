package util;

public class Pessoa {
	public String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String name, int age, double height){
		this.nome = name;
		this.idade = age;
		this.altura = height;
	}
	public Pessoa() {
		this.nome = "none";
		this.idade = 0;
		this.altura = 0;
	}
	public void setname(String name) {
		this.nome = name;
	}
	public void setage(int age) {
		this.idade = age;
	}
	public void setheight(double height) {
		this.altura = height;
	}
	public int getAge() {
		return idade;
	}
	public void printName() {
		System.out.printf("%s\n",this.nome);
		return;
	}
}
