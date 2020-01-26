import java.util.*;
import Lecture;

public class Topic
{
	private String name;
	private List<Topic> topics=new ArrayList<>();
	private List<Lecture> lectures=new ArrayList<>();

	public Topic(String name){
		this.name=name;
	}

	public void addTopic(Topic t){
		topics.add(t);
	}
	public void addLecture(Lecture l){
		lectures.add(l);
	}

	public void display(String indentlvl){
		System.out.println(indentlvl+name);
		for(Topic t:topics){
			t.display(indentlvl+indentlvl);
		}

		for(Lecture l:lectures){
			l.display(indentlvl);
		}
	}
}
