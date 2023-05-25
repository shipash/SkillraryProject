package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class contain elements and respective elements of home page of SkillRary
 * @author ShiPash
 *
 */
public class SkillraryHomePage {

	
	//Declaration
	
	@FindBy(xpath="//img[@alt='SkillRary']")
	private WebElement logo;
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement skillraryDemoAppLink;
	
	
	//Initialization
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getLogo()
	{
		return logo;
	}
	public void clickGearTab()
	{
		gearsTab.click();
	}
	public void clickSkillraryDemoApp()
	{
		skillraryDemoAppLink.click();
	}
}
