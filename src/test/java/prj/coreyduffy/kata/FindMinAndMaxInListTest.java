package prj.coreyduffy.kata;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class FindMinAndMaxInListTest {

    @Test
    public void testFindMinAndMaxInList() {
        assertArrayEquals(new int[] {1, 1}, FindMinAndMaxInList.getMinMax(Arrays.asList(1)));
        assertArrayEquals(new int[] {1, 2}, FindMinAndMaxInList.getMinMax(Arrays.asList(1, 2)));
        assertArrayEquals(new int[] {1, 2}, FindMinAndMaxInList.getMinMax(Arrays.asList(2, 1)));
        assertArrayEquals(new int[] {-1, 100}, FindMinAndMaxInList.getMinMax(Arrays.asList(-1, 100, 2, 3, 7, 8, 0)));
    }
}
