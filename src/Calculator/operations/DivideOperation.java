package Calculator.operations;

public class DivideOperation {
	double a = 0;
	double b = 0;
	
	public void setA(double input) {
		this.a = input;
	}
	
	public void setB(double input) {
		this.b = input;
	}
	
	public double getResult() {
		return this.a / this.b;
	}
	

}
