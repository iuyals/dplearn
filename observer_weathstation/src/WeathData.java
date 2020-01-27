
import java.util.*;public class WeathData
{
    private double temperature;
    private double humidity;
    private double pressure;
    private ArrayList<Display> displays=new ArrayList<>();
    
    
    public double getTemperature(){
        return this.temperature;
    }
    
    public double getHumidity(){
        return this.humidity;
    }
    
    public double getPressure(){
        return this.pressure;
    }
    
    public void addDisplay(Display newDisplay){
        this.displays.add(newDisplay);
    }
    
    public void setMessurements(double t,double h,double p){
        this.temperature=t;
        this.humidity=h;
        this.pressure=p;
        messurementsChanged();
    }
        
    
    public void messurementsChanged(){
        double t=getTemperature();
        double h=getHumidity();
        double p=getPressure();
        
        for(Display d:displays){
            d.update(t,h,p);
        }
    }
}
