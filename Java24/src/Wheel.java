
public class Wheel {
	public static void main(String[] args) {
		String phrase[] = {
			"A Stitch in Time Saves Nine",
			"Dont' Eat Yellow Snow",
			"Just Do It",
			"Every Good Boy Does Fine",
			"I Want My MTV",
			"I Like Ike",
			"Play it Again, Sam",
			"Frosty the Snowman",
			"One More for the Road",
			"Home Field Advantage",
			"Valentine's Day Massacre",
			"Grover Cleveland Ohio",
			"Spaghetti Western",
			"Aqua Teen Hunger Force",
			"It's a Wonderful Life"
		};
		
		int[] letterCount = new int[26];
		for (int count = 0; count < phrase.length; count++) {
			String current = phrase[count].toUpperCase();
			char[] letters = current.toCharArray();
			
			for (int count2 = 0; count2 < letters.length; count2++) {
				char lett = letters[count2];
				if ( (lett >= 'A') & (lett <= 'Z') ) {
					letterCount[lett - 'A']++;
				}
			}
		}
		
		for (char count = 'A'; count <= 'Z'; count++) {
			System.out.print(count + ": " + letterCount[count - 'A'] + " ");
		}
		System.out.println();
	}
}
