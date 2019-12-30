package auto;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class demo {
	private Properties pro = new Properties();
	public void ParseProperties(String propertiespath) throws java.io.IOException {
		this.loadProperties(propertiespath);		
	}
	
	private void loadProperties(String propertiespath) throws java.io.IOException {
		try {
			InputStream in = new FileInputStream(propertiespath);
			pro.load(in);					
		}catch (IOException e) {
			e.printStackTrace();					
		}			
	}
	
	public String getTestData(String keyname) {
		return pro.getProperty(keyname).trim();
		
}
	
	//---------add by lh 2019/12/30
	
	
}
