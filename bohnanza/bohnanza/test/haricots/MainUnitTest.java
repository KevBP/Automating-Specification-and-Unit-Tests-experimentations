package haricots;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainUnitTest {

    @Test
    public void testMainVide() {
        Main main = new Main(Collections.EMPTY_LIST);
        Assert.assertTrue(main.isEmpty());
    }

    @Test
    public void testRetirePremiereCarte() {
        Haricot haricot1 = Mockito.mock(Haricot.class);
        Main main = new Main(new ArrayList<Haricot>(Arrays.asList(haricot1)));
        Assert.assertEquals(haricot1, main.retirePremiereCarte());
        Assert.assertTrue(main.isEmpty());
    }
}
