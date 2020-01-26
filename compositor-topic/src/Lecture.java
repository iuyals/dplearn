public class Lecture implements Module
{
	private String name;
	
	public Lecture(String name){
		this.name=name;
	}
	
	public void display(String indentlvl){
		System.out.println(indentlvl+this.name);
	}
}
