package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Integer> filtered = numbers.stream()
				.filter(n -> n % 2 == 0)
				.collect(Collectors.toList());

		filtered.stream().forEach(x -> System.out.println(x));	
	}
}
