package br.com.inmetrics.teste.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"br.com.inmetrics.teste.steps", "br.com.inmetrics.teste.suport"},
        tags = {"@Cadastro_Usuario_003"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"
        }
)

public class RunCucumberTest {

}