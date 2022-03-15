package training.collections47;

import java.util.ArrayList;

public class ArrayListRetrieve {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();

		colours.add("Green");
		colours.add("Blue");
		colours.add("Red");
		String value = colours.get(2);

		System.out.println(value);

	}
}
