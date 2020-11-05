package steps;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

//Classe de Screenshot - captura de telas
public class Screenshot extends SOCTestPageBase {

	public void screenshot(WebDriver driver) throws IOException {

		/*
		 * É WebDriver porque precisa do momento atual do driver - Gera arquivo - O
		 * navegador passa a ter os metodos de screenshot - e retorna um screenshot
		 * Caminho da pasta + nome do arquivo - usa a hora atual em milissegundos O
		 * arquivo é direcionado para pasta de destino
		 */

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotArquivo = "target/Screenshots/" + System.currentTimeMillis() + ".jpg";
		FileHandler.copy(screenshot, new File(screenshotArquivo));
	}

}
