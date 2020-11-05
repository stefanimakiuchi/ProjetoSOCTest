package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SOCTestPageBase {

	protected WebDriver driver;

	public void abrirNavegador() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\natha\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ww2.soc.com.br/blog/");
	}

	public void fecharNavegador() {
		driver.quit();
	}
}
