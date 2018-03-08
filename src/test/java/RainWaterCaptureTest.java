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

//    @Test
//    public void testGetHighestWallToTheRight() {
//        waterTrapped = new TrappingRain();
//        Integer[]wallHeightTest = {13,5,8,9,3,0};
//        Integer testWallAtIndex = 1;
//        Integer expected = 9;
//        Integer actual = waterTrapped.getHighestWallToTheRight(wallHeightTest,testWallAtIndex);
//
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void testGetHeighestWallToTHeRight2(){
//        waterTrapped = new TrappingRain();
//        Integer[]wallHeightTest = {3,21,13,8,15,9,10,0};
//        Integer testWallAtIndex = 7;
//        Integer expected = 0;
//        Integer actual = waterTrapped.getHighestWallToTheRight(wallHeightTest,testWallAtIndex);
//
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void testGetWaterTrappedAtIndex() {
//        waterTrapped = new TrappingRain();
//        Integer[]wallHeightTest = {11,9,7,16,0,1};
//        Integer indexOfWall =2;
//        Integer expected = 4;
//        Integer actual =waterTrapped.getWaterTrappedAtIndex(wallHeightTest,indexOfWall);
//
//        Assert.assertEquals(expected,actual);
//    }
//
//    @Test
//    public void testGetTotalWaterTrapped1() {
//        waterTrapped = new TrappingRain();
//        Integer[]wallHeightTest = {7,4,0,9};
//        Integer expected =10;
//        Integer actual = waterTrapped.getTotalWaterTrapped(wallHeightTest);
//
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void testGetTotalWaterTrapped2(){
//        waterTrapped = new TrappingRain();
//        Integer[]wallHeightTest ={4,7,3,11,2,13,1,0};
//        Integer expected =13;
//        Integer actual = waterTrapped.getTotalWaterTrapped(wallHeightTest);
//
//        Assert.assertEquals(expected,actual);
//    }
//    @Test
//    public void testGetTotalWaterTrapped3(){
//        Integer trapped = new Integer();
//        Integer[]wallHeightTest = {11,2,18,21,33,3,1,7,15};
//
//        Integer expected= 43;
//        Integer actual = trapped.rainWater (wallHeightTest);
//
//        Assert.assertEquals(expected,actual);
//    }

}

