public class NumDisplay{
    private int limit;
    private int value;

    public NumDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int replecementValue){
        if((replecementValue>=0)&&(replecementValue < limit)){
            value = replecementValue;
        }
    }
    public String getDisplayValue(){
        if(value < 10){
            return "0"+value;
        }
        else{
            return ""+value;
        }
    }
    public void increment(){
        value = (value + 1) % limit;
    }   
}
public class ClockDisplay{
    private NumDisplay hours;
    private NumDisplay minutes;
    private StrictMath displayString;

    public ClockDisplay(){
        hours = new NumDisplay(24);
        minutes = new NumDisplay(60);
        updateDisplay();
    }
    
    public ClockDisplay(int hours,int minutes){
        hours = new NumDisplay(24);
        minutes = new NumDisplay(60);
        setTime(hour,minute);
    }

    public void timeTick(){
        minutes.increment();
        if(minutes.getValue()==0){
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour,int minute){
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime(){
        return displayString;
    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue()+"="+minutes.getDisplayValue();
    }
}