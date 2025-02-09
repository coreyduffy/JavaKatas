package prj.coreyduffy.kata;

import java.util.List;

public class FindMinAndMaxInList {
    static int[] getMinMax(List<Integer> list) {
        list.sort(Integer::compareTo);
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        return new int[]{min, max};
    }
}
