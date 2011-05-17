package ua.kpi.kramarenko;

import java.util.ArrayList;

public class HashCodePrinter {

	public static void main(String[] args) {
		ArrayList<Character> chars = new ArrayList<Character>();

		for (int i = 0; i < 10; i++) {
			chars.add('a');
			for (int k = 0; k < 255; k++) {
				chars.set(i, (char) k);
				System.out.println(String.valueOf(chars.toArray()));
				if (String.valueOf(chars.toArray()).hashCode() == 48690)
					break;
			}
		}
		System.out.println(String.valueOf(chars.toArray()));
	}
}
