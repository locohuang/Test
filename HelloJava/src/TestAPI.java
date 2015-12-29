import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
public class TestAPI {
	public static void main(String[] args){
		String str="abceffew.mp3.abc.jpg";
		String [] strArray = str.split("\\.");		
		/*String str2="a==1 and b==2 or c==3";		
		String[] strArray2=str2.split("and|or");		
		for (String s : strArray2) {
			System.out.println(s+"  ");
		}*/		
		System.out.println(strArray.length);		
		for(String s:strArray){
			System.out.println(s+"  ");
		}		
		Date date=new java.util.Date();
		System.out.println(date);
		Calendar cal=Calendar.getInstance();
		System.out.println("cal:"+cal.getTime());
		DateFormat df=DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(new Date()));
		System.out.println(df.format(cal.getTime()));		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		System.out.println(sdf.format(new Date()));
		System.out.println(sdf.format(new Date(System.currentTimeMillis())));
		
		Random r=new Random();
		System.out.println(Math.round(Math.random()*100));
		//StringBuffer jdk1.4 线程安全 StringBuilder jdk1.5非线程安全
		StringBuilder sb=new StringBuilder();
		sb.append(UUID.randomUUID().toString());
		sb.append(".");
		sb.append(strArray[strArray.length-1]);
		System.out.println(sb);
		
		Date d1=new Date(1439017920000l);
		System.out.println(d1.getHours()+":"+d1.getMinutes());
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(1439046000000l);
		SimpleDateFormat tempDate = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		tempDate.format(c.getTime());
		if(c.get(Calendar.MINUTE)==0) 
			System.out.println(c.get(Calendar.HOUR_OF_DAY)+":00");
		else {
			System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
		}
		String[] contents="overup1Rate,2,1.09;overup2Rate,0,0.77".split(";");
		System.out.println(contents[0]);
	}
}
