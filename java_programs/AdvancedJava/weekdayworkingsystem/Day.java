package weekdayworkingsystem;

public enum Day 
{
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THURSDAY(true),
    FRIDAY(true),
    SATURDAY(false),
    SUNDAY(false);
        
    private boolean  workingDay;
    
    Day(boolean workingDay){
    this.workingDay= workingDay;
    
}
    public boolean workingDay() {
        return workingDay;
    }

    public boolean weekend() {
        return !workingDay;
    }
    
}
