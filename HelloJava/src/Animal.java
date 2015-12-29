
public class Animal {
	String name;
	public Animal(){
		
	}
	public Animal(String name){
		this.name=name;
	}
	public void printName(){
		System.out.println("name="+name);
	}
	public void shout(){
		System.out.println("动物发出声音！");
	}
	
}

//继承
/*
 *为什么要使用继承：软件复用 
 *如果使用继承 
 *重新父类的方法
 * super关键字：使用super关键字调用父类的方法；使用super关键字调用父类构造函数
 *final关键字：使用final关键字修饰的类不能被继承；使用final关键字修饰的父类方法不能被重写；使用final关键字修饰的变量只能被赋值一次 
 *
 */
