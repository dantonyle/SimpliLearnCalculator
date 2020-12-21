package Calculator.operations;

public class MultiplyOperation {
	int a = 0;
	int b = 0;
	
	public void setA(int input) {
		this.a = input;
	}
	
	public void setB(int input) {
		this.b = input;
	}
	
	public int getResult() {
		return this.a * this.b;
	}
}
