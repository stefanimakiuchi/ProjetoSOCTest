package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SOCTestPage extends SOCTestPageBase {

	public WebElement botaoAceitarCookies() {
		return driver.findElement(By.id("barra-cookie"));
	}

	public WebElement campoBuscar() {
		return driver.findElement(By.name("s"));
	}

	public WebElement botaoPesquisar() {
		return driver.findElement(By.className("lupa-form"));
	}

	public WebElement botaoSolucoesERecursos() {
		return driver.findElement(By.className("mostra-submenu"));
	}

	public WebElement botaoFAP() {
		return driver.findElement(By.cssSelector(
				"#navegacao-superior > ul > li.mostra-submenu > div > div:nth-child(2) > ul > li:nth-child(4) > a > abbr"));
	}

	public WebElement campoNomeDaEmpresa() {
		return driver.findElement(By.id("nomeEmpresa"));
	}

	public WebElement campoFAP() {
		return driver.findElement(By.id("fap"));
	}

	public WebElement campoRAT() {
		return driver.findElement(By.className("label"));
	}

	// WebDriverWait para evitar o erro pela demora em carregar os elementos - 10s
	// até que o elemento seja clicável
	public WebElement campoRatSelecao() {
		return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"#frmcalculadora > div.col-sm-12 > div:nth-child(3) > span > div > div.selectric-items > div > ul > li:nth-child(2)")));
	}

	public WebElement campoProjecaoDeMassaSalarial() {
		return driver.findElement(By.id("projecao"));
	}

	public WebElement botaoEstimarFAP() {
		return driver.findElement(By.id("estimar"));
	}
}
