package prj.coreyduffy.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculateStringRotationTest {
    @Test
    public void test() {
        assertEquals(-1, CalculateStringRotation.getShiftedDiff("hoop","pooh"));
        assertEquals(2, CalculateStringRotation.getShiftedDiff("coffee","eecoff"));
        assertEquals(4, CalculateStringRotation.getShiftedDiff("eecoff","coffee"));
    }
}
