package prj.coreyduffy.kata;

// Challenge taken from https://www.codewars.com/kata/5259510fc76e59579e0009d4/java
public class DidYouMean {
    private final String[] knownWords;

    public DidYouMean(String[] knownWords) {
        this.knownWords = knownWords;
    }

    public String findMostSimilar(String wordToCompare) {
        int minDistance = Integer.MAX_VALUE;
        String mostSimilarWord = "";
        for (String knownWord : knownWords) {
            int distance = getLevenshteinDistance(wordToCompare, knownWord);
            if (distance < minDistance) {
                minDistance = distance;
                mostSimilarWord = knownWord;
            }
        }
        return mostSimilarWord;
    }

    // NOTE: StringUtils has a method for this, but I'm not using it here
    private int getLevenshteinDistance(String source, String target) {
        source = source.toLowerCase();
        target = target.toLowerCase();
        int[] distanceCosts = new int[target.length() + 1];
        for (int index = 0; index < distanceCosts.length; index++) {
            distanceCosts[index] = index;
        }
        for (int sourceIndex = 1; sourceIndex <= source.length(); sourceIndex++) {
            distanceCosts[0] = sourceIndex;
            int previousCost = sourceIndex - 1;
            for (int targetIndex = 1; targetIndex <= target.length(); targetIndex++) {
                int substitutionCost = source.charAt(sourceIndex - 1) == target.charAt(targetIndex - 1) ? previousCost : previousCost + 1;
                int deletionInsertionCost = 1 + Math.min(distanceCosts[targetIndex], distanceCosts[targetIndex - 1]);
                int cost = Math.min(deletionInsertionCost, substitutionCost);
                previousCost = distanceCosts[targetIndex];
                distanceCosts[targetIndex] = cost;
            }
        }
        return distanceCosts[target.length()];
    }
}
