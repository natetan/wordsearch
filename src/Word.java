/**
 *  Yulong Tan
 *  4.28.16
 *
 *  Word class is used to separate random letters from actual searched words.
 *  Companion class to WordSearch
 */

public class Word {
    private String word;

    public Word() {
        this("");
    }

    public Word(String s) {
        this.word = s;
    }

    public String toString() {
        return this.word;
    }
}
