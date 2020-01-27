public class ConditionDisplay implements Display
{
    public ConditionDisplay(){
        
    }
    public ConditionDisplay(WeathData wd){
        wd.addDisplay(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure)
    {
        // TODO: Implement this method
        System.out.println("Condition:");
        System.out.println("current tem: "+ Double.toString(temperature));
        System.out.println("current hum: "+ Double.toString(humidity));
        System.out.println("current pre: "+ Double.toString(pressure));
    }

}
