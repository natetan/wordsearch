import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Yulong on 1/29/2016.
 *
 * Possible collabs: Brandon, Alan
 */

public class WordSearch {
    public static final int DEFAULT = 11;
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    private int[][] puzzle;
    private SortedSet<String> wordList;

    public WordSearch() {
        this(DEFAULT, null);
    }

    /**
     *  MISSING: #1: A way to put the letters in array before adding randoms
     *           #2: The length of the words must be size n or less, otherwise,
     *           shouldn't add it to the array
     *           #3: Placement of word in array must not exceed over size
     */

    public WordSearch(int n, Collection<String> words) {
        if (words.size() < 1) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        this.puzzle = new int[n][n];
        this.wordList = new TreeSet<String>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // need this if check
                    // if (position at [i][j] is an empty string, then insert a random letter)
                this.puzzle[i][j] = ALPHABET.charAt((int)Math.random() * 26);
            }
        }
        for (String word : words) {
            this.wordList.add(word);
        }
    }

    // should choose a selection of letters and group them together (word)
    // then check to see if that word is in the list of words
    // selects them from a starting coordinate and an ending one
    public void select(int x1, int y1, int x2, int y2) {
        String selection = "";
        // 0,0 -> 0, 5
        if (x1 == x2) {

        } else { //diagonals?

        }
    }

    // Word is considered valid even if found 'backwards'
    // Must check if selection && reverse(selection) = existing word
    private String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
