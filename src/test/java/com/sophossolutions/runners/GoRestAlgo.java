package com.sophossolutions.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.sophossolutions.stepdefinitions", "com.sophossolutions.hooks"}, 
		features = "src/test/resources/com/sophossolutions/features/go_rest_algo.feature",

		snippets = SnippetType.CAMELCASE)
public class GoRestAlgo {

}