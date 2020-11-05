package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		// Determina quais features vão executar (localiza)
		features = "src/test/resources/features/SOC_Test.feature",
		// Determina em que package encontrar os passos
		glue = "steps",
		// Determina como sera a formatação de saída do teste - informações no console e
		// geração de relatório HTML
		plugin = { "pretty", "html:target/HTMLReports/report.html" },
		// Melhora a visualização no console e as cores
		monochrome = true,
		// Executa os cenários que possuem esta TAG
		tags = "@teste")

public class SOCTestRunner {

}