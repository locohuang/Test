
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread myThread=new MyThread();
		//myThread.run();
		//myThread.start();
		//Thread thread=new Thread(myThread);
		//thread.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println("MyThread类的run方法在运行...");
				}
			}
		}).start();
		while(true){
			System.out.println("main方法在运行");
		}
	}	
}

/*class MyThread extends Thread{
	public void run(){
		while(true){
			System.out.println("MyThread类的run方法在运行...");
		}
	}
}*/
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("MyThread类的run方法在运行...");
		}
	}
	
}