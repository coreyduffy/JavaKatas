package prj.coreyduffy.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DidYouMeanTest {

    @Test
    public void testBerries() {
        DidYouMean didYouMean = new DidYouMean(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        assertEquals("strawberry", didYouMean.findMostSimilar("strawbery"));
        assertEquals("cherry", didYouMean.findMostSimilar("berry"));
    }

    @Test
    public void testLanguages() {
        DidYouMean didYouMean = new DidYouMean(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        assertEquals("java", didYouMean.findMostSimilar("heaven"));
        assertEquals("javascript", didYouMean.findMostSimilar("javascript"));
    }

}
