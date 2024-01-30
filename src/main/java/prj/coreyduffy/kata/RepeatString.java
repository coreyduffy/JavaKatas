package prj.coreyduffy.kata;

public class RepeatString {

    // A function that accepts an integer 'repeat' and a string 's' as parameters,
    // and returns a string of s repeated exactly 'repeat' times.
    public static String repeatString(final int repeat, final String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
