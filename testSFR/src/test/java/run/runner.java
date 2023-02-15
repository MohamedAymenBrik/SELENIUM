package run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(tags = "@tag"	
,features = "src/test/features/sprint1/authentificationorangehrm.feature"
,glue={"partieStepDefinition","hooks"}
,publish = true
,plugin= {"pretty"
		,"html:target/cucumber-reports.html"
		,"json:target/cucumber-reports"
		,}
,snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE
,monochrome = true

		
		)
public class runner {

}
