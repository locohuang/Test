import java.util.Random;
import java.util.Scanner;


public class TestRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char []ch=str.toCharArray();
		String strRandom="";
		for(int i=1;i<=6;i++){
			int randomInt=new Random().nextInt(62);
			strRandom+=ch[randomInt];
		}
		System.out.println(strRandom);
		
		System.out.println("请输入验证码：");
		String inputStr=null;
		inputStr=new Scanner(System.in).nextLine();
		if(inputStr.endsWith(strRandom)){
			System.out.println("通过验证");
		}else{
			System.out.println("未通过验证"+inputStr);
		}
	}
}
