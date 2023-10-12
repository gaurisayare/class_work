//Createa class father, son and baby. All three classes have a method move. Write Specific comment inside that like
//for father I can walk with the help of stick, and for son I can run fast, and for baby I can nicely crawl
//Use multilevel inheritance (overriding is used here- method with same name used in all the classes )

class Father
{
	//method in superclass
	public void move()
	{
		System.out.println("I can walk with the help of stick. ");
	}
}
9

//Son inherits Animal
class Son extends Father
{
	//overriding the move() method
	@Override
	public void move()
	{
		//call method of superclass
		super.move();
		System.out.println("I can run Fast. ");
 	}
	
}

//Baby inherits Son
class Baby extends Son
{
	//overriding the move() method
	@Override
	public void move()
	{
		//call method of superclass
		super.move();
		System.out.println("I can nicely crawl. ");
 	}
}
class MultilevelInheritance3
{
	public static void main(String args[])
	{
		//create an object of the subclass
		Baby obj = new Baby();
		
		//call the move method
		obj.move();
	}
}