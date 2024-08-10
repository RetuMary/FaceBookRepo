package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.InputStream;
import java.io.OutputStream;
public class PropertiesFile {

	static Properties prop = new Properties();
	static String projectpath = System.getProperty("user.dir");


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getproperties();
		setproperties();
	}
	// to input or read data from propertiesfile.
	public static void getproperties() {

		try {

			InputStream input = new FileInputStream(projectpath + "\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
		} catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}

	//to write data in the properties file .

	public static void setproperties() {
		try {
			OutputStream output = new FileOutputStream(projectpath + "\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "FireFox");
		
		prop.store(output,null);
		
		
		}	catch (Exception exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();


		}
	}}