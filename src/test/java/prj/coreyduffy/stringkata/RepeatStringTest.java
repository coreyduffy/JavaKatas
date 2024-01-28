package prj.coreyduffy.stringkata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static prj.coreyduffy.stringkata.RepeatString.repeatString;

public class RepeatStringTest {
    @Test
    public void test4a() {
        assertEquals("aaaa", repeatString(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", repeatString(3, "Hello"));
    }

    @Test
    public void test5empty() {
        assertEquals("", repeatString(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", repeatString(0, "kata"));
    }
}
