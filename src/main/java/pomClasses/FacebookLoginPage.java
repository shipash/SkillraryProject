package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//Declaration
	
	@FindBy(xpath="//span[contains(@class,'xg8j3zb')]")
	private WebElement fbLoginHeader;
	
	//initialization
	
	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public String getPageHeader()
	{
		return fbLoginHeader.getText();
	}

}
