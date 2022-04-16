package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassPojo extends BaseClass{
	
	public ForgottenPassPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement btnforgotten;
	
	@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearchBox;

	public WebElement getBtnforgotten() {
		return btnforgotten;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnSearchBox() {
		return btnSearchBox;
	}
	
	
	
	
	

}
