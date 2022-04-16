package org.stepDefinition;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before

	public void bef() {

		System.out.println("before scenario.....");
		launchBrowser();
		maxBrowser();

	}

	@Before(order = 2)

	public void befSce2() {
		System.out.println("bef Sec 2");

	}

	@Before(order = 1)

	public void befSce1() {
		System.out.println("bef Sec 1");

	}

	@Before(order = 3)

	public void befSce3() {
		System.out.println("bef Sec 3");

	}

	@After(order = 1)

	public void aftSce1() {
		System.out.println("aft Sce1");

	}

	@After(order = 3)

	public void aftSce3() {
		System.out.println("aft Sce3");

	}

	@After(order = 2)

	public void aftSce2() {
		System.out.println("aft Sce2");

	}

	@After
	public void aft(Scenario s) {

		if (s.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);

			s.embed(screen, "image/png");

		}

		toQuit();
	}

}
