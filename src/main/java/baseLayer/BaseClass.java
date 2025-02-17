package baseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();

	public WebDriver getDriver() {
		return td.get();
	}

	public void initilization(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriver driver = new ChromeDriver();
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriver driver = new EdgeDriver();
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("headless")) {

			ChromeOptions opt = new ChromeOptions();
			
			// Handle SSL Certificates
			opt.setAcceptInsecureCerts(true);

			opt.addArguments("--headless");

			WebDriver driver = new ChromeDriver(opt);
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("incognito")) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(opt);
			td.set(driver);
		} else if (browsername.equalsIgnoreCase("firefox")) {

			WebDriver driver = new FirefoxDriver();
			td.set(driver);
		}

		else {
			System.out.println("Please Enter valid Browser name");
		}

		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		getDriver().manage().deleteAllCookies();
		getDriver().get("https://ui.cogmento.com/");

	}

}
