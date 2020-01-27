import java.util.*;
import Topic;
import Lecture;

public class Main
{
	public static void main(String[] args)
	{
		//add new module very easy now,only need create new class implments Module,then add it here
		System.out.println("topic with composer start! its hard to add new elements of topic like Note");
		System.out.println();

		Topic dpTopic=new Topic("topic of desigin pattern");
		Lecture dpLecture=new Lecture("lecture of design pattern");
		Lecture dpLecturep=new Lecture("more about dp");
		Video introVideo=new Video("video introduce to dp");

		Topic cpsTopic=new Topic("topic of compositor");
		Lecture cpsLectures=new Lecture("lecture for compositor");
		Video cpsVideo=new Video("short video for composer dp");
		
		dpTopic.addModule(cpsTopic);
		dpTopic.addModule(dpLecture);
		dpTopic.addModule(dpLecturep);
		dpTopic.addModule(introVideo);

		cpsTopic.addModule(cpsLectures);
		cpsTopic.addModule(cpsVideo);

		dpTopic.display("    ");

	}
}
