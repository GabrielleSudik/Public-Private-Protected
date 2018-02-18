

public class Field {
	
	private Plant plant2 = new Plant();
	
	public Field() {
		
		//size is protected but Field is in the same package as Plant
		//so size will work here.
		//i'm confused as to why Field is in the same package
		//but Oak wasn't. 
		
		System.out.println(plant2.size);
	}

}
