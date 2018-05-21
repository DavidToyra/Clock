/**
 *  Name: David Töyrä
 *  CS: dv15dta
 *  Date: 2017-05-03
 *  File: NumberDisplayTest.java
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberDisplayTest
{
    private int minLimit = 0;
    private int maxLimit = 59;
    private NumberDisplay displayTest = new NumberDisplay(minLimit,maxLimit);

    @Test
    public void createNumberDisplayTest() throws Exception
    {
        new NumberDisplay(15,49);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createNumberDisplayTestFails() throws Exception
    {
        new NumberDisplay(11,10);
    }

    @Test
    public void setValueTest() throws Exception
    {
        displayTest.setValue(40);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setValueTestFails() throws Exception
    {
        displayTest.setValue(80);
    }


    @Test
    public void getValueTest()
    {
        assertEquals(displayTest.getValue(),minLimit);
    }

    @Test
    public void incrementTest() throws Exception
    {
        displayTest.setValue(minLimit);
        displayTest.increment();
        assertEquals(minLimit+1,displayTest.getValue());

        displayTest.setValue(maxLimit);
        displayTest.increment();
        assertEquals(displayTest.getValue(),minLimit);
    }

    @Test
    public void didWrapAroundTest() throws Exception
    {
        displayTest.setValue(maxLimit);
        displayTest.increment();
        assertEquals(true, displayTest.didWrapAround());

        displayTest.setValue(minLimit);
        displayTest.increment();
        assertEquals(false, displayTest.didWrapAround());
    }
}