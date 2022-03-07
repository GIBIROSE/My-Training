package training.collections47;

import java.util.ArrayList;

public class ArrayListIteration {
	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();

		colours.add("Green");
		colours.add("Blue");
		colours.add("Red");

		System.out.println("Accessing individual elements:  ");

		for (String s : colours) {
			System.out.print(s);
			System.out.print(", ");
		}

	}
}
