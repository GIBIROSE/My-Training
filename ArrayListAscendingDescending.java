package training.collections47;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAscendingDescending {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(200);
		numbers.add(10);
		numbers.add(20);
		numbers.add(600);
		numbers.add(300);

		Collections.sort(numbers);
		System.out.println("Sorted ArrayList in Ascending order : ");

		for (Integer i : numbers) {
			System.out.print(i + " ");

		}
		System.out.println();
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("Sorted ArrayList in descending order ");

		for (Integer i : numbers) {
			System.out.print(i + " ");

		}

	}

}
