import com.DivideByMinus;


public class TestDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
			c=divide(5,-22);
			System.out.println("结果："+c);
		} catch (DivideByMinus e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static int divide(int a,int b) throws DivideByMinus{
		if(b<0){
			throw new DivideByMinus("除数不能为负数！");
		}
		return a/b;
	}

}
