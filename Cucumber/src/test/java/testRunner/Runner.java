package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		          features = {"src/test/java/features/"},  //location of feature file. Should give the entire location
		          dryRun = !true,  //dryRun checks whether mapping has been done correctly or not.(Mapping between feature file and step definition) 
		                          //If dryRun = true it doesn't execute the code.
		                          //It executes the code if dryRun = false. If we want only snippets then say dryRun = true
		          glue = {"steps","hooks"}, //Location of step definition. It is enough to give only the package name, Location of hooks. It is enough to give only the package name
		          snippets =  SnippetType.CAMELCASE, //to get the snippets(methods) in CamelCase. By default it will come with underscore.
		          monochrome = true, // to remove junk characters in the console	
		          plugin = {"pretty",       //for more details in the console
		        		    "html:Reports/Reports.html", //for html report
		        		   } 
		          
//		          tags= "@smoke or @regression"
		          )



public class Runner extends AbstractTestNGCucumberTests{

}
