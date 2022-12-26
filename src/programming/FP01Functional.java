package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		//printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);

	}
	
	private static boolean isEven(int number) {
		return number%2 == 0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//what to do?
		numbers.stream().forEach(System.out::println); //METHOD REFERENCE
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//what to do?
		numbers.stream()
			.filter(FP01Functional::isEven)
			.forEach(System.out::println); //METHOD REFERENCE
	}

	
}