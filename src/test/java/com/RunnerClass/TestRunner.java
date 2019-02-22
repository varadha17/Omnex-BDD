 package com.RunnerClass;

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		
		features="C:\\Users\\Omnex\\.eclipse\\OmnexBDD\\src\\main\\java\\com\\Featurefile\\AddParentEntity.feature",
		glue="com.stepDefinition",
		format={"pretty","html:test-output", "junit:junit_xml/cucumber.xml"},
		tags={"@smoke"}, 
		monochrome=true
		
		
		)


public class TestRunner {

}
