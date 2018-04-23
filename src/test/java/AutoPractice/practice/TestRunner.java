package AutoPractice.practice;


import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\prakashd\\Prakash_Automation\\practice\\src\\test\\java\\AutoPractice\\practice\\test.feature",
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
)

public class TestRunner {
	@AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("C:\\Users\\prakashd\\Prakash_Automation\\practice\\src\\test\\java\\AutoPractice\\practice\\config\\test.xml"));
    
    }
}jjjjjjjjjjjjjjjjjj