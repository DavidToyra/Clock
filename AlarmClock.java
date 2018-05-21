/**
 *  Name: David Töyrä
 *  CS: dv15dta
 *  Date: 2017-05-03
 *  File: AlarmClock.java
 */

/**
 * Extension of clock class, alarm functionality has been added.
 */
public class AlarmClock extends Clock
{
    private NumberDisplay alarmHours;
    private NumberDisplay alarmMinutes;
    private boolean alarmCondition = false;

    /**
     * Constructor for alarm extension, sets alarm to 00:00
     */
    public AlarmClock()
    {
        super();

        alarmHours = new NumberDisplay(0,23);
        alarmMinutes = new NumberDisplay(0,59);
        setAlarm(0, 0);

    }
    /**
     * Constructor for alarm extension
     * @param hour
     * @param minute
     * @throws IllegalArgumentException
     */


    public AlarmClock( int hour, int minute)
    {
        super(hour, minute);

        alarmHours = new NumberDisplay(0,23);
        alarmMinutes = new NumberDisplay(0,59);
        setAlarm(hour, minute);

    }

    /**
     * Set alarm to input.
     * @param hour
     * @param minute
     * @throws IllegalArgumentException
     */
    public void setAlarm(int hour, int minute)
    {
        this.alarmMinutes.setValue(minute);
        this.alarmHours.setValue(hour);
        turnOn();
    }

    /**
     * Checks if alarm is ringing, returns true if it is.
     * @return boolean value.
     */
    public boolean isTriggered()
    {
        if(alarmCondition && getTime().equals(getAlarm()))
        {
            return true;
        }

        return false;
    }

    /**
     * Turn on the alarm.
     */
    public void turnOn()
    {
        alarmCondition = true;

    }

    /**
     * Turn off the alarm.
     */
    public void turnOff()
    {
        alarmCondition = false;
    }

    public String getAlarm()
    {
        return this.alarmHours.getDisplayValue()+":"+
                this.alarmMinutes.getDisplayValue();
    }

    /**
     * Increases Clock class minute by one
     * and checks if alarm is triggered.
     */
    @Override
    public void timeTick()
    {
        super.timeTick();
        if(isTriggered())
        {
            System.out.println("alarm");
        }
    }

}
