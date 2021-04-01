package interfaceDemo;

public class Main {

	public static void main(String[] args) {
		
		Cow myCow = new Cow();//create an object of a class
		
		myCow.color();//outcome of abstract method
		myCow.sound();
		myCow.legs();
		//myCow.learnInterface();//outcome of usual method
	}
}
