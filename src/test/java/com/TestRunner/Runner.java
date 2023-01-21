package com.TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
      (
        features="src\\test\\resources\\Features\\LoginPage.feature",
        glue="com.StepDefination",
        dryRun=false,
        monochrome=true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@Smoke"
		)

public class Runner {

	
}
