package prj.coreyduffy.kata;

// Challenge taken from https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
public class MultiplicationTableForNumber {

    public static String getMultiplicationTable(int number) {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i<11; i++) {
            result.append(i).append(" * ").append(number).append(" = ").append(number * i).append("\n");
        }
        return result.toString().trim();
    }
}
