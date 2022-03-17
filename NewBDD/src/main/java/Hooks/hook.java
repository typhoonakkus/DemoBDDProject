package Hooks;


import java.sql.Date;
import java.sql.Timestamp;
import Base.DriverManager;
import Utility.Util;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class hook extends DriverManager{
	
	Date date = new Date(0);
	  Timestamp lDate = new Timestamp(date.getTime());
	
	

	@AfterStep
	public void afterStep(Scenario scenario) {
		System.out.println("After Step Hook Screenshot*****************");
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName()+lDate); 		
	}
	


	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("After Hook Screenshot*****************");
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName()+lDate); 
		
	}
	}
