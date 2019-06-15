package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	
	Properties prop;
	
	public Configuration() {
		
		try {
			File src=new File("./util/Config.property");
			
			FileInputStream fis=new FileInputStream(src);
			
			prop=new Properties();
			
			prop.load(fis);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getURL() {
		
		return prop.getProperty("URL");
			
	}
	
public String getGeckoPath() {
		
		return prop.getProperty("GeckoDriverPath");
			
	}

	public static void main(String[] args) {
		System.out.println();
	}
	
}
