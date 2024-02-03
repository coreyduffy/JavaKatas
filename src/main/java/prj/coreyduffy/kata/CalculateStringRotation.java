package prj.coreyduffy.kata;

public class CalculateStringRotation {

    // Write a function that receives two strings and returns n, where n is equal to the number of characters we should shift the first string forward to match the second.
    // The check should be case-sensitive.
    // For instance, take the strings "fatigue" and "tiguefa". In this case, the first string has been rotated 5 characters forward to produce the second string,
    // so 5 would be returned.
    // If the second string isn't a valid rotation of the first string, the method returns -1.

    // Refactored Attempt
    public static int getShiftedDiff(String first, String second) {
        if (first.length() != second.length()) {
            return -1;
        }
        return (second + second).indexOf(first);
    }

    //  First Attempt
    private static int getShiftedDiffFirstAttempt(String first, String second) {
        if (first.equals(second)) {
            return 0;
        }
        if (first.length() != second.length()) {
            return -1;
        }

        int shiftedDiff = 1;
        for (int count = 0; count < first.length(); count++) {
            StringBuilder sb = new StringBuilder();
            String[] s1Letters = first.split("");
            sb.append(s1Letters[first.length() - 1]);
            for (int i = 0; i < first.length() - 1; i++) {
                sb.append(s1Letters[i]);
            }
            if (sb.toString().equals(second)) {
                return shiftedDiff;
            }
            first = sb.toString();
            shiftedDiff++;
        }
        return -1;
    }
}
