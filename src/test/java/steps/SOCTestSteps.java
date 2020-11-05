package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class SOCTestSteps extends SOCTestPage {

	Screenshot screenshot = new Screenshot();

	@Dado("que o usuário acesse o blog da SOC")
	public void que_o_usuário_acesse_o_blog_da_soc() throws IOException {
		abrirNavegador();
		screenshot.screenshot(driver);
	}

	@Dado("clica no botão Aceitar Cookies")
	public void clica_no_botão_aceitar_cookies() throws IOException {
		botaoAceitarCookies().click();
		screenshot.screenshot(driver);
	}

	// CENÁRIO: DEVE REALIZAR UMA BUSCA NO BLOD DA SOC
	@Dado("preenche o campo Buscar")
	public void preenche_o_campo_buscar() throws IOException {
		campoBuscar().sendKeys("Tecnologia");
		screenshot.screenshot(driver);
	}

	@Quando("clica no botão Pesquisar")
	public void clica_no_botão_pesquisar() throws IOException {
		botaoPesquisar().click();
		screenshot.screenshot(driver);
	}

	// Validação da pesquisa
	@Então("o resultado da pesquisa deverá ser apresentado com sucesso")
	public void o_resultado_da_pesquisa_deverá_ser_apresentado_com_sucesso() throws IOException {
		boolean teste = driver.getPageSource().contains("Resultado da sua busca NO BLOG:");
		assertTrue("Resultado da sua busca NO BLOG:", teste);

		/*
		 * String pesquisa = driver.findElement(By.
		 * linkText("AGE Technology realiza a 2ª Semana da Tecnologia")).getText().trim(
		 * ); assertEquals("AGE Technology realiza a 2ª Semana da Tecnologia",
		 * pesquisa); screenshot.screenshot(driver);
		 */
		fecharNavegador();
	}

	// CENÁRIO: DEVE REALIZAR CÁLCULO DO FAP
	@Dado("clica no botão Soluções e Recursos")
	public void clica_no_botão_soluções_e_recursos() throws IOException {
		botaoSolucoesERecursos().click();
		screenshot.screenshot(driver);
	}

	@Quando("clica no botão FAP")
	public void clica_no_botão_fap() throws IOException {
		botaoFAP().click();
		screenshot.screenshot(driver);
	}

	// Validação de acesso a página FAP
	@Então("visualiza a página da FAP")
	public void visualiza_a_página_da_fap() throws IOException {
		String paginaFAP = driver.getTitle().trim();
		assertEquals("FAP - SOC - Software Integrado de Gestão Ocupacional", paginaFAP);
		screenshot.screenshot(driver);
	}

	@Então("preenche os dados do calculo do FAP")
	public void preenche_os_dados_do_calculo_do_fap() throws IOException {
		// Nome Empresa
		campoNomeDaEmpresa().sendKeys("Raquel e Vitor Informática Ltda");
		// Preenche FAP com 2
		campoFAP().sendKeys("2");
		// Clica e seleciona 1 no RAT
		campoRAT().click();
		campoRatSelecao().click();
		// Preenche a Projeção de Massa Salarial
		campoProjecaoDeMassaSalarial().sendKeys("1.500,00");
		screenshot.screenshot(driver);
	}

	@Quando("clica no botão Estimar FAP")
	public void clica_no_botão_estimar_fap() throws IOException {
		botaoEstimarFAP().click();
		screenshot.screenshot(driver);
	}

	// Validação da Estimativa do FAP
	@Então("O calculo do FAP deverá ser apresentado com sucesso")
	public void o_calculo_do_fap_deverá_ser_apresentado_com_sucesso() throws IOException {
		String estimativa = driver.findElement(By.className("header-relatorio")).getText().trim();
		assertEquals("ESTIMATIVA FAP DA EMPRESA", estimativa);
		screenshot.screenshot(driver);
		fecharNavegador();
	}
}