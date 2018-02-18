

public class Plant {
	
	public String name;
	//because this is public, you can access it anywhere
	//BUT instance variables shouldn't be public
	//so it's bad practice.
	//you want to make people access them through methods.
	
	public final static int Identity = 8;
	//same. except you can't change this because it's final.
	//this is acceptable practice.
		
	//private for variables is also good practice.
	//accessible only within the same class
	private String type;
	
	//how to allow this variable to be accessible in children?
	protected String size;
	
	//what if you don't give a variable any protection level?
	int height;
	//it's treated as accessible with the package.
	
	public Plant() {
		name = "Robbie.";
		type = "hardwood";
		size = "large";
		height = 60;
	}

}
