package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		//printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);

	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//what to do?
		numbers.stream().forEach(System.out::println); //METHOD REFERENCE
	}

	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//what to do?
		numbers.stream()
			//.filter(FP01Functional::isEven)
			.filter(number -> number%2 == 0) //expressoes lambda sao formas de expressar um metodo, uma funcao
			.forEach(System.out::println); //METHOD REFERENCE
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		//what to do?
		numbers.stream()
			.filter(number -> number%2 == 0) //expressoes lambda sao formas de expressar um metodo, uma funcao
			.map(number -> number * number)
			.forEach(System.out::println); //METHOD REFERENCE
	}


	
}
