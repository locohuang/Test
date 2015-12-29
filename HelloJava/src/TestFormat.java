
public class TestFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.ceil(5.9));
		System.out.println(Math.floor(-4.4));
		String ss="abccdefcdh";
		System.out.println(Math.round(2.45));
		String[] sssStrings=ss.split("c");
		for(String i:sssStrings){
			System.out.println(i);
		}
		System.out.println(sssStrings.length);
		
		
		String str="1221223343.23522";
		String[]strs=str.split("\\.");
		String strValue2=String.format("%.2f",Float.parseFloat("0."+strs[1]));
		System.out.println(strValue2);
		
		int length=strs[0].length();
		int remain=length%3;
		String strValue1="";
		strValue1=strValue1+strs[0].substring(0, remain);
		System.out.println(strValue1);
		int pos=remain;
		while(pos<length){
			if(!strValue1.equals("")){
				strValue1=strValue1+",";
			}
			strValue1+=strs[0].substring(pos, pos+3);
			pos+=3;
		}
		System.out.println(strValue1+"."+strValue2.substring(2,4));
	}

}
