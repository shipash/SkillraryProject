package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;
/**
 * This class contains elements and respective business libraries of Skillrary Demo App Page
 * @author ShiPash
 *
 */
public class SkillraryDemoAppPage
{
	//declaration

	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement logo;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private WebElement categoryDD;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//initialization
	
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	/**
	 * This method is used to return text on the logo.
	 * @return
	 */
	public String getLogoText()
	{
		return logo.getText();
	}
	
	/**
	 * this method is used to mouse hover to Course Tab
	 * @param web
	 */
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseOver(courseTab);
	}
	
	/**
	 * This method is used to click on SeleniumTraining Tab
	 */
	public void clickSeleniumTraining()
	{
		seleniumTrainingLink.click();
	}
	
	
	/**
	 * This method is used to select category from DropDown based on index.
	 * @param web
	 * @param index
	 */
	public void selectCategory(WebDriverUtility web, int index)
	{
		web.dropdown(categoryDD,index);
	}
	
	
	/**
	 * This method is used to return Contact Us link
	 * @return
	 */
	public WebElement getContactUs() 
	{
		return contactUsLink;
	}
	
	/**
	 * This Method is is used to click ContactUs link
	 */
	
	public void clickContactUs()
	{
		contactUsLink.click();	
	}
}
