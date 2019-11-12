import org.junit.Assert;
import org.junit.Test;

public class StringCompareTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }
    // TODO
    @Test
    public void test1() throws Exception {
    	Assert.assertEquals(1, StringCompare.compare("a", "a"));
    }
    @Test
    public void test2() throws Exception {
    	Assert.assertEquals(0, StringCompare.compare("a", "b"));
    }
    @Test
    public void test3() throws Exception {
    	Assert.assertEquals(1, StringCompare.compare("aa", "ba"));
    }
    @Test
    public void test4() throws Exception {
    	Assert.assertEquals(3, StringCompare.compare("cassis", "castor"));
    }
    @Test
    public void test5() throws Exception {
    	Assert.assertEquals(-1, StringCompare.compare("tacos", "poulpe"));
    }
    @Test
    public void test6() throws Exception {
    	Assert.assertEquals(-1, StringCompare.compare(null, null));
    }
    @Test
    public void test7() throws Exception {
    	Assert.assertEquals(-1, StringCompare.compare(null, "toto"));
    }
    @Test
    public void test8() throws Exception {
    	Assert.assertEquals(-1, StringCompare.compare("titi", null));
    }
    @Test
    public void test9() throws Exception {
    	Assert.assertEquals(0,StringCompare.compare("", ""));
    }
}
