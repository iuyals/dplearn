import java.util.*;
import Lecture;

public class Topic implements Module
{
	private String name;
	private List<Module> modules=new ArrayList<>();

	public Topic(String name){
		this.name=name;
	}

	public void addModule(Module m){
		modules.add(m);
	}

	public void display(String indentlvl){
		System.out.println(indentlvl+name);
		for(Module m:modules){
			m.display(indentlvl+indentlvl);
		}

	}
}
