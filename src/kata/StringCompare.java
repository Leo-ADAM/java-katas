public class StringCompare {

    // TODO
	public static int compare(String word1, String word2) {
		if(word1 == null || word2 == null || word1.length() != word2.length()) {
			return -1;
		}
		int nb = 0;
		for (int i=0; i < word1.length(); i++) {
			if (word1.charAt(i) == word2.charAt(i)) {
				nb++;
			}
		}
		return nb;
	
	}
}
