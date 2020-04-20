package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	public static String getData(String name) {
		File file = new File("./src/test/java/resources/config.properties");
		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties prop = new Properties();

		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return (prop.getProperty(name));

	}

	public static void addData(String key, String val) {
		try {
			File file = new File("./src/main/resources/com/bookmyfurniture/common/configure.properties");
			Properties properties = new Properties();
			properties.load(new FileInputStream(file));
			FileOutputStream obj = new FileOutputStream(file);
			properties.setProperty(key, val);
			properties.store(obj, "Updated data into file");

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
