package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
                  features= {"src/test/java/features"},
                  dryRun = !true,
                  glue= {"stepdef","hooks"},
                  snippets =  SnippetType.CAMELCASE,
                  monochrome = true,
                  plugin = {"pretty",     
		        		    "html:Reports/Reports.html", 
		        		   }
		        )



public class Runner extends AbstractTestNGCucumberTests {

}
