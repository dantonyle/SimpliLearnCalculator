package Calculator.operations;

public class SubOperation {
	private double a = 0;
	private double b = 0;
	
	public void setA(double input) {
		this.a = input;
	}
	
	public void setB(double input) {
		this.b = input;
	}
	
	public double getResult() {
		return this.a - this.b;
	}
}
