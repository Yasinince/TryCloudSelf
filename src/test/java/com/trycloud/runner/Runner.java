package com.trycloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this class has purpose of instructing how and what kind of feature we want to run

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", // -> or: "classpath:features"
        glue = "com/trycloud/step_definitions", // -> which part to connect (step defs)
        publish = false, // -> it will give you public link for your local report
        plugin = {
                "pretty", "html:target/cucumber.html",
                "rerun:target/rerun.txt",  // store the failed scenario into rerun.txt
                "me.jvt.cucumber.report.PrettyReports:target"  // fancy report
        },
        //tags = "@US2",
        dryRun = true
)
public class Runner {
}