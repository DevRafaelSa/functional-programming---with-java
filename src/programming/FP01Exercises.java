package programming;

import java.util.List;

public class FP01Exercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		printCubeOfOddNumbersInListFunctional(numbers);
		//printOddNumbersInListFunctional(numbers);
		
		List<String> courses = 
				List.of("Spring", "Spring Boot", "API", "Microservices",
						"AWS", "PCF", "Azure", "Docker", "Kubernets");
		
		//courses.stream().forEach(System.out::println);

		//courses.stream()
			//.filter(course -> course.contains("Spring"))
			//.forEach(System.out::println);
		
		//courses.stream()
		//	.filter(course -> course.length() >= 4)
		//	.forEach(System.out::println);
		
		courses.stream()
			.map(course -> course + " " + course.length())
			.forEach(System.out::println);
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 1) //expressoes lambda sao formas de expressar um metodo, uma funcao
			.forEach(System.out::println); //METHOD REFERENCE
	}
	
	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			.filter(number -> number%2 == 1) //expressoes lambda sao formas de expressar um metodo, uma funcao
			.map(number -> number * number * number)
			.forEach(System.out::println); //METHOD REFERENCE
	}

	
}
