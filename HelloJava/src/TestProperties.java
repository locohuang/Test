import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class TestProperties {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties properties=new Properties();
		String config="/com/jdbc.properties";
		InputStream is=
				TestProperties.class.getResourceAsStream(config);
		String driver="";
		String url="";
		String user="";
		String pwd="";
		try {
			properties.load(is);
			//properties.setProperty("jdbc.driver", "value1");
			driver=properties.getProperty("jdbc.driver");
			url=properties.getProperty("jdbc.url");
			user=properties.getProperty("jdbc.user");
			pwd=properties.getProperty("jdbc.pwd");
			System.out.println("driver:"+driver);
			System.out.println("url:"+url);
			System.out.println("user:"+user);
			System.out.println("pwd:"+pwd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
