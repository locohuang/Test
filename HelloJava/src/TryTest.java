import java.util.Scanner;


public class TryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		int k;
		while(true){
			System.out.println("输入0结束,输入1继续");
			k=new Scanner(System.in).nextInt();
			if(k==0) break;
			System.out.println("输入两个正整数：");
			a=new Scanner(System.in).nextInt();
			b=new Scanner(System.in).nextInt();
			try {
				c=divide(a, b);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("结果是："+c);
			/*try{
				c=divide(a, b);
				System.out.println("结果是："+c);
			}
			catch(Exception e){
				//System.out.println(e.getMessage());
				System.out.println("除数不能为0！");
			}
			finally{
				System.out.println("无论什么时候都会执行到这里！");
			}*/
		}
	}
	static int divide(int a,int b) throws Exception{
		return a/b;
	}

}
