
public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Dog1 dog1=new Dog1();
		dog1.shout();
		*/
		/*Dog2 dog2=new Dog2();
		dog2.shout();
		dog2.breathe();*/
		/*Animal2 a1=new Dog2();
		Animal2 a2=new Cat2();
		animalShout(a1);
		animalShout(a2);*/
		/*class Dog3 implements Animal2{

			@Override
			public void shout() {
				// TODO Auto-generated method stub
				System.out.println("Dog3");
			}
			
		}*/
		//Animal2 a=new Dog3();
		//animalShout(new Dog3());
		animalShout(new Animal2() {
			
			@Override
			public void shout() {
				// TODO Auto-generated method stub
				System.out.println("Dog3");
			}
		});
	} 
	public static void animalShout(Animal2 animal2){
		animal2.shout();
	}

}
