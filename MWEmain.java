/**
 * Created by david on 2017-08-08.
 */
public class MWEmain
{
    public static void main( String[] args )
    {

        /*
         *Creates a clock object and checks time, time should be 00:00.
         */
        System.out.println("Creates clock object and checks time");
        Clock TestClock = new Clock();
        System.out.println(TestClock.getTime());

        /*
         *Tests the setTime method in clock.
         */
        System.out.println("Sets clock time to 23:59");
        TestClock.setTime(23, 59);
        System.out.println(TestClock.getTime());

        /*
         *Checks if timeTick increases minutes by one.
         */
        System.out.println("Set Clock to 05:00 and check if a call to timeTick turns it to 05:01");
        TestClock.setTime(5, 0);
        TestClock.timeTick();
        System.out.println(TestClock.getTime());

        /*
         *Checks if timeTick can increase hours if minutes are capped.
         */
        System.out.println("Set Clock to 23:59 and check if a call to timeTick turns it to 00:00");
        TestClock.setTime(23, 59);
        TestClock.timeTick();
        System.out.println(TestClock.getTime());

        /*
         *Creates an alarmclock object and checks its time, time should be 00:00.
         */
        System.out.println("Creates alarmclock object and checks alarm time");
        AlarmClock TestAlarm = new AlarmClock();
        System.out.println(TestAlarm.getAlarm());

        /*
         *Sets the alarm to a valid time and checks if it will ring during 24 hours,
         *timeTick will loop 1440 times.
         */
        System.out.println("Set alarm to 15:30 and checks if it rings during a 24 hour period.");
        TestAlarm.setAlarm(15, 30);
        for(int i=0; i<1440; i++)
        {
            TestAlarm.timeTick();
        }

        /*
         *Sets the alarm to a valid time but turns it off and checks if it rings during 24 hours,
         *the alarm should not ring.
         */
        System.out.println("Turn alarm off and checks if it rings during the same period");
        TestAlarm.turnOff();
        for(int i=0; i<1440; i++)
        {
            TestAlarm.timeTick();
        }
    }

}
