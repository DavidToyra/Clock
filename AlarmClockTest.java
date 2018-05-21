/**
 *  Name: David Töyrä
 *  CS: dv15dta
 *  Date: 2017-05-03
 *  File: AlarmClockTest.java
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AlarmClockTest
{
    private AlarmClock clockTest;

    @Test
    public void createAlarmTest()
    {
        new AlarmClock(5,30);
    }


    @Test(expected = IllegalArgumentException.class)
    public void createAlarmTestFail()
    {
        new AlarmClock(30,5);
    }

    @Test
    public void getAlarmTest()
    {
        clockTest = new AlarmClock();
        assertEquals("00:00", clockTest.getAlarm());
    }

    @Test
    public void setTimeAlarmTest()
    {

        clockTest = new AlarmClock();
        clockTest.setAlarm(10, 55);
        assertEquals("10:55", clockTest.getAlarm());
    }


    @Test
    public void alarmTimeTickTest()
    {
        clockTest = new AlarmClock();
        clockTest.timeTick();
        assertEquals("00:00",clockTest.getAlarm());
    }

    @Test
    public void isTriggeredTest()
    {
        clockTest = new AlarmClock();
        clockTest.setTime(1,10);
        clockTest.setAlarm(1, 11);
        clockTest.timeTick();

        assertEquals(true, clockTest.isTriggered());
    }

}
