package training.collections47;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		ArrayList<String> colours = new ArrayList<>();

		colours.add("Green");
		colours.add("Blue");
		colours.add("Red");
		colours.add("Yellow");
		colours.remove(0);

		for(String s:colours){
			System.out.println(s);
		}
	}
}
