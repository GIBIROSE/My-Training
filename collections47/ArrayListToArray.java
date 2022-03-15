package training.collections47;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(200);
		numbers.add(10);
		numbers.add(20);
		numbers.add(600);
		numbers.add(300);

		Integer[] arr = new Integer[numbers.size()];
		arr = numbers.toArray(arr);
		System.out.println("Array : ");
		for (Integer value : arr)
			System.out.print(value + " ");

	}

}
