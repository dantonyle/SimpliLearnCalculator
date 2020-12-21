package Calculator;
import Calculator.operations.AddOperation;
import Calculator.operations.SubOperation;
import Calculator.operations.MultiplyOperation;
import Calculator.operations.DivideOperation;
import java.util.Scanner;

public class InteractiveCalculator {
	
	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number A please:");
		int numberA = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Give me a number B please:");
		int numberB = scanner.nextInt();
		System.out.println("Give me a operation please:");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		int result = 0;
		if (operation.equals("add")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
		} else if (operation.equals("substract")) {
			SubOperation substract = new SubOperation();
			substract.setA(numberA);
			substract.setB(numberB);
			result = substract.getResult();
		} else if (operation.equals("multiply")) {
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result = multiply.getResult();
		} else if (operation.equals("divide")) {
			if(numberB == 0) {
				System.out.println("The result is undefined");
			}else {
				DivideOperation divide = new DivideOperation();
				divide.setA(numberA);
				divide.setB(numberB);
				result = divide.getResult();
			}
		} else {
			System.out.println("Did not understand operation");
		}

		System.out.println("The result is");
		System.out.println(result);
		
	}
	
	
}

