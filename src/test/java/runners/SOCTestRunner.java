package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// Determina quais features v�o executar (localiza)
		features = "src/test/resources/features/SOC_Test.feature",
		// Determina em que package encontrar os passos
		glue = "steps",
		// Determina como sera a formata��o de sa�da do teste - informa��es no console e
		// gera��o de relat�rio HTML
		plugin = { "pretty", "html:target/HTMLReports/report.html" },
		// Melhora a visualiza��o no console e as cores
		monochrome = true,
		// Executa os cen�rios que possuem esta TAG
		tags = "@teste")

public class SOCTestRunner {

}