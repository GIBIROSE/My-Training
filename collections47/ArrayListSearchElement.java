package training.collections47;

import java.util.ArrayList;

public class ArrayListSearchElement {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);

		boolean value = numbers.contains(200);

		if (value)
			System.out.println("The list contains value");
		else
			System.out.println("The list does not contains value");

	}

}
