package Bahar;

public class Duplication {
    public static void main(String[] args) {
        String word = "jaaaavaaa";
        System.out.println(uniq(word));

    }
    public static String uniq (String word) {
        String uniq= "";
        for (int i = 0; i < word.length(); i++) {
        if (!uniq.contains(word.charAt(i)+"")) {
            uniq += word.charAt(i);
        }
        }
        return uniq;
    }
}
