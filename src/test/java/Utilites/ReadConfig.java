package Utilites;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

public Properties pro;
	
	public ReadConfig()
	{
		File file = new File("C:\\Users\\LENOVO PC\\eclipseworkspace\\nopcommerce\\src\\test\\java\\Readconfig.properties");
		try {
			FileInputStream fis = new FileInputStream (file);
			pro = new Properties();
			pro.load(fis);
			
		}
		catch(Exception e)
		{
			System.out.println("exception is" + " " + e.getMessage());
		}
	}
		
	
	
	public String geturl()
	{
		return pro.getProperty("url");
	}
	
	public String getbrowser()
	{
		return pro.getProperty("browser");
	}
	
	
}
