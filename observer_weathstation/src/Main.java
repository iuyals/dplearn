import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
        // i use composite,seems works much like observer,add new display only need create the display with weathData,then if weathData change,latest info will be displayed
		System.out.println("weathstation with composite!");
        
        WeathData wd=new WeathData();
        ConditionDisplay cd=new ConditionDisplay(wd);
        
        wd.setMessurements(1.0,2.0,3.0);
	}
}
