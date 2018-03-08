import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RainWaterCaptureTest {

    RainWaterCapture tester;

    @Before
    public void setUp() {

        tester = new RainWaterCapture();
    }

    @Test
    public void testTotalReturned() {

        Integer[] walls ={7,4,0,9};
        Integer expected = 10;
        Integer actual = tester.rainWaterRetained(walls);

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testTotalReturned1(){

            Integer[] walls ={7,6,0,1,4,0,9};
            Integer expected = 24;
            Integer actual = tester.rainWaterRetained(walls);

            Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTotalReturned2(){

        Integer[] walls ={1,9,12,0,0,0,9};
        Integer expected = 27;
        Integer actual = tester.rainWaterRetained(walls);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTotalReturned3(){

        Integer[] walls ={3,1,2,7,4,0,9,12,4,3,18};
        Integer expected = 30;
        Integer actual = tester.rainWaterRetained(walls);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTotalReturned4(){

        Integer[] walls ={2,1};
        Integer expected = 0;
        Integer actual = tester.rainWaterRetained(walls);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTotalReturned5(){

        Integer[] walls ={24,0,3,8,21,0,21};
        Integer expected = 73;
        Integer actual = tester.rainWaterRetained(walls);

        Assert.assertEquals(expected,actual);
    }


}

