public class PracticeProblem {

	public static void main(String args[]) {

	}
public static boolean isPalindrome(String word) {
    String word2 = word.replace(" ", "");
	String word3=word2.toLowerCase();
    for (int i = 0; i < word3.length() / 2; i++) {
        if (word3.charAt(i) != word3.charAt(word3.length() - 1 - i)) {
            return false;
        }
    }

    return true;
}
}
