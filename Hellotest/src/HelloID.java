import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class HelloID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "E://Selenium Software//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com/");
		//E:\Selenium Software
		System.out.println("Sarath testing");
		driver.getTitle();
		driver.close();
		// test
		
	}
	
	int [] x = new int [3];
	
}
