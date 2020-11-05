package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import org.openqa.selenium.By;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Ent�o;
import io.cucumber.java.pt.Quando;

public class SOCTestSteps extends SOCTestPage {

	Screenshot screenshot = new Screenshot();

	@Dado("que o usu�rio acesse o blog da SOC")
	public void que_o_usu�rio_acesse_o_blog_da_soc() throws IOException {
		abrirNavegador();
		screenshot.screenshot(driver);
	}

	@Dado("clica no bot�o Aceitar Cookies")
	public void clica_no_bot�o_aceitar_cookies() throws IOException {
		botaoAceitarCookies().click();
		screenshot.screenshot(driver);
	}

	// CEN�RIO: DEVE REALIZAR UMA BUSCA NO BLOD DA SOC
	@Dado("preenche o campo Buscar")
	public void preenche_o_campo_buscar() throws IOException {
		campoBuscar().sendKeys("Tecnologia");
		screenshot.screenshot(driver);
	}

	@Quando("clica no bot�o Pesquisar")
	public void clica_no_bot�o_pesquisar() throws IOException {
		botaoPesquisar().click();
		screenshot.screenshot(driver);
	}

	// Valida��o da pesquisa
	@Ent�o("o resultado da pesquisa dever� ser apresentado com sucesso")
	public void o_resultado_da_pesquisa_dever�_ser_apresentado_com_sucesso() throws IOException {
		boolean teste = driver.getPageSource().contains("Resultado da sua busca NO BLOG:");
		assertTrue("Resultado da sua busca NO BLOG:", teste);

		/*
		 * String pesquisa = driver.findElement(By.
		 * linkText("AGE Technology realiza a 2� Semana da Tecnologia")).getText().trim(
		 * ); assertEquals("AGE Technology realiza a 2� Semana da Tecnologia",
		 * pesquisa); screenshot.screenshot(driver);
		 */
		fecharNavegador();
	}

	// CEN�RIO: DEVE REALIZAR C�LCULO DO FAP
	@Dado("clica no bot�o Solu��es e Recursos")
	public void clica_no_bot�o_solu��es_e_recursos() throws IOException {
		botaoSolucoesERecursos().click();
		screenshot.screenshot(driver);
	}

	@Quando("clica no bot�o FAP")
	public void clica_no_bot�o_fap() throws IOException {
		botaoFAP().click();
		screenshot.screenshot(driver);
	}

	// Valida��o de acesso a p�gina FAP
	@Ent�o("visualiza a p�gina da FAP")
	public void visualiza_a_p�gina_da_fap() throws IOException {
		String paginaFAP = driver.getTitle().trim();
		assertEquals("FAP - SOC - Software Integrado de Gest�o Ocupacional", paginaFAP);
		screenshot.screenshot(driver);
	}

	@Ent�o("preenche os dados do calculo do FAP")
	public void preenche_os_dados_do_calculo_do_fap() throws IOException {
		// Nome Empresa
		campoNomeDaEmpresa().sendKeys("Raquel e Vitor Inform�tica Ltda");
		// Preenche FAP com 2
		campoFAP().sendKeys("2");
		// Clica e seleciona 1 no RAT
		campoRAT().click();
		campoRatSelecao().click();
		// Preenche a Proje��o de Massa Salarial
		campoProjecaoDeMassaSalarial().sendKeys("1.500,00");
		screenshot.screenshot(driver);
	}

	@Quando("clica no bot�o Estimar FAP")
	public void clica_no_bot�o_estimar_fap() throws IOException {
		botaoEstimarFAP().click();
		screenshot.screenshot(driver);
	}

	// Valida��o da Estimativa do FAP
	@Ent�o("O calculo do FAP dever� ser apresentado com sucesso")
	public void o_calculo_do_fap_dever�_ser_apresentado_com_sucesso() throws IOException {
		String estimativa = driver.findElement(By.className("header-relatorio")).getText().trim();
		assertEquals("ESTIMATIVA FAP DA EMPRESA", estimativa);
		screenshot.screenshot(driver);
		fecharNavegador();
	}
}