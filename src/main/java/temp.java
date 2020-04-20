import java.awt.AWTException;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class temp {
	static int x = 10;
	temp(){
		
		System.out.println(x);
	}
	public static void main(String[] args) throws AWTException {
		
}
	
	public static void waits() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
