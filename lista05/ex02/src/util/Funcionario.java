package util;

public class Funcionario {
	public String nome;
	public double gross;
	public double tax;
	
	public double net() {
		return this.gross-this.tax;
	}
	public double increase(double perc) {
		return (this.gross * perc/100) + this.net();
	}
}
