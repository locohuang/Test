
public class Cat extends Animal{

	public Cat(String name){
		super(name);
	}
	public void printName(){
		System.out.println("name="+name);
	}
	public void shout(){
		System.out.println("喵喵...");
		super.printName();
		this.printName();
	}
}
