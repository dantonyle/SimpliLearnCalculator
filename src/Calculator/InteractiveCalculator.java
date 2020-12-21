package Calculator;
import Calculator.operations.AddOperation;
import Calculator.operations.SubOperation;
import Calculator.operations.MultiplyOperation;
import Calculator.operations.DivideOperation;
import java.util.Scanner;

public class InteractiveCalculator {
	
	public static final void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a integer number A please:");
		double numberA = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Give me a integer number B please:");
		double numberB = scanner.nextInt();
		double result = 0;
		boolean undefinedCheck = false;
		boolean boolResult;
		String operation;
		boolean firstRun = true;
		
		do {
			scanner.reset();
			boolResult = true;
			
			if (firstRun) {
				System.out.println("Give me a operation please:");
				scanner.nextLine();
				firstRun = false;
			}
			operation = scanner.nextLine();
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
					undefinedCheck = true;
				}else {
					DivideOperation divide = new DivideOperation();
					divide.setA(numberA);
					divide.setB(numberB);
					result = divide.getResult();
				}
			} else {
				System.out.println("Did not understand operation - Please enter exactly: add, subtract, divide, or multiply.");
				boolResult = false;
			}
			
		} while (boolResult == false);
		
		scanner.close();
		
		if (undefinedCheck == false) {
			System.out.println("The result is");
			if (result%1 == 0) {
				System.out.println((int)result);
			} else {
				System.out.println(result);
			}
			
		} else {
			System.out.println("The result is undefined, dividing by 0");
		}
	}
	
	
}

