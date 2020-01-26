public class Video implements Module
{
	private String name;
	
	public Video(String name){
		this.name=name;
	}

	@Override
	public void display(String indentlvl)
	{
		// TODO: Implement this method
		System.out.println(indentlvl+this.name);
	}

}
