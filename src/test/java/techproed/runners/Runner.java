package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) // --> Scenario calistirici notasyonu. Cucumber ile junit entegrasyonunu saglar.
@CucumberOptions(features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@bahadirAlistirma",
        dryRun = false, // --> true secersek scenariolari kontrol eder browser'i calistirmaz.
        monochrome = true
)

/*
CucumberOptions() notasyonuna parametre olarak
    features  --> features package'inin yolunu belirtiriz.(content root)
    glue      --> stepdefinition package in yolunu belirtiriz.(source root)
    tags      --> calistirmak istedigimiz scenariolari bu parametrede belirtiriz.

CucumberOptions() notasyonunda scenariolarin nerede ve nasil calisacagi, hangi raporu kullanacagi ile alakali
secenekleri belirtiriz.
 */

public class Runner {

}

