import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testTrue() throws Exception {
        Assert.assertEquals(true, true);
    }

    @Test
    public void test1() throws Exception {
        Assert.assertEquals(0, Fibonacci.fibo(0));
        Assert.assertEquals(1, Fibonacci.fibo(1));
        Assert.assertEquals(3, Fibonacci.fibo(4));
        Assert.assertEquals(5, Fibonacci.fibo(5));
    }
}
