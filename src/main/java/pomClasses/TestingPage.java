package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class contains elements and respective business libraries of Testing Page
 * @author ShiPash
 *
 */
public class TestingPage
{
//Declaration
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(xpath="//img[@id='Python']")
	//@FindBy(id="Python")
	private WebElement pythonImage;
	
	@FindBy(xpath="//div[@id='cartArea']")
	//@FindBy(id="cartArea")
	private WebElement myCart;
	
	@FindBy(xpath="//ul/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	@FindBy(xpath="//p[@id='the_total']")
	private WebElement total;
	
	
	//Initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	public WebElement getPythonImage()
	{
		return pythonImage;
	}
	
	public WebElement getMyCart()
	{
		return myCart;
	}
	
	public WebElement getFacebookIcon()
	{
		return facebookIcon;
	}
	
	public void clickFacebook()
	{
		facebookIcon.click();
	}
	
	public String getTotal()
	{
		return total.getText();
	}
}
