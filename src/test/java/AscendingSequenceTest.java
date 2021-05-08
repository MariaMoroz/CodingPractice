import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingArrayPositiveCase() {
        int startNumber = 1;
        int endNumber = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testAscendingArrayZeroCase(){
        int startNumber = 0;
        int endNumber = 3;
        int[] expectedResult = {0,1,2,3};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testAscendingArrayNegativeNumbersCase(){
        int startNumber = -5;
        int endNumber = -2;
        int[] expectedResult = {-5,-4,-3,-2};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }
    @Test
    public void testAscendingArrayNegativePositiveNumbersCase(){
        int startNumber = -5;
        int endNumber = 2;
        int[] expectedResult = {-5,-4,-3,-2,-1, 0, 1, 2};

        AscendingSequence ascendingSequence = new AscendingSequence();
        int[] actualResult = ascendingSequence.buildAscendingArray(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult,actualResult);
    }

}
