

public class Oak extends Plant {
	
	public Oak() {
		
		//this won't work because "type" is private in the parent class
		//private isn't even accessible to children.
		//type = "tree";
		
		//the following will work here because "size" is protected.
		//it will work in children/subclasses and within a package.
		size = "medium";
		
		height = 70;
		
	}

}
