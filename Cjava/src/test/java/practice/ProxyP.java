package practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxyP {

	public static void main(String[] args) {
		// TODO Au9to-generated method stub

		Proxy proxy = new Proxy();
		proxy.setHttpProxy("localhost:8080");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		//@SuppressWarnings("deprecation")
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(cap);
		driver.get("https://www.google.com");
	}

}
