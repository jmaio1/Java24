import java.util.*;

public class Name {
	public static void main(String[] args) {
		String names[] = { "Lauren", " Audrina", "Heidi", "Whitney", "Stephanie", "Spencer", "Lisa", "Brody", "Frankie", "Holly", "Jordan",  "Brian", "Jason" };
		
		System.out.println("The original order:");
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + ": " + names[i] + " ");
		}
		
		Arrays.sort (names);
		
		System.out.println("\n The new order:");
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + ": " + names[i] + " ");
		}
		System.out.println();
	}
}
