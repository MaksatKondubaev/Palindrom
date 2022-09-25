import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word and i'll tell you if it's a palindrom or not:");
		String word = input.nextLine();
		char[] wArray = word.toCharArray();
		System.out.println(isPalindrom(wArray));
	}
	private static boolean isPalindrom(char[] word) {
		int i1 = 0;
		int i2 = word.length - 1;
		while (i2 > i1) {
			if (word[i1] != word[i2]) {
				return false;
			}
			++i1;
			--i2;
		}
		return true;
	}
}
