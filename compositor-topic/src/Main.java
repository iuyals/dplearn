import java.util.*;
import Topic;
import Lecture;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("topicnd start! its hard to add new elements of topic like Note");
		System.out.println();

		Topic dpTopic=new Topic("topic of desigin pattern");
		Lecture dpLecture=new Lecture("lecture of design pattern");
		Lecture dpLecturep=new Lecture("more about dp");

		Topic cpsTopic=new Topic("topic of compositor");
		Lecture cpsLectures=new Lecture("lecture for compositor");

		dpTopic.addTopic(cpsTopic);
		dpTopic.addLecture(dpLecture);
		dpTopic.addLecture(dpLecturep);

		cpsTopic.addLecture(cpsLectures);

		dpTopic.display("    ");

	}
}
