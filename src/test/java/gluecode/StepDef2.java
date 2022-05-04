package gluecode;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDef2
{
	public Shared sh;
	//Dependency injection via constructor
	public StepDef2(Shared x)
	{
		sh=x;
	}
	//Step definitions
	@When("i entered a value and verify title")
	public void method4(DataTable dt) throws Exception
	{
		//Take data from DataTable
		List<Map<String,String>> l=dt.asMaps();
		for(int i=0; i<l.size(); i++)
		{
			//Fill search box
			sh.obj.fillSearchboxAndClickEnter(l.get(i).get("word"));
			Thread.sleep(5000);
			sh.driver.navigate().back();
		}
	}

	@When("close site")
	public void method5()
	{
		sh.driver.close();
	}

}
