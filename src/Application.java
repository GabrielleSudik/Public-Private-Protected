//this lesson is about access levels

public class Application {
	
	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		
		//the following won't work because "type" is private
		//it works only in that class alone.
		//System.out.println(plant1.type);
		
		//"size" works for both Plant and Oak because it is protected.
		
		System.out.println(plant1.size);
		
		Oak oak1= new Oak();
		
		System.out.println(oak1.size);
		
		//"height" works because it was given no instructions
		//so it defaults to accessible within the package
		System.out.println(plant1.height);
		System.out.println(oak1.height);
	}

}

//teacher showed us how to put some of the classes into another package.
//right-click on the src file to create a new package
//you can have different classes in the same project in diff packages
//even parent and child classes.
