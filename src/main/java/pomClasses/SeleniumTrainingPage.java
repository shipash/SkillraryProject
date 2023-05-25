package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;
/**
 * This class contains elements and respective business libraries of selenium training page.
 * @author ShiPash
 *
 */
public class SeleniumTrainingPage {
//Declaration
	
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id="add")
	private WebElement plusButton;
	
	@FindBy(id="quantity")
	private WebElement quantity;
	
	@FindBy(xpath="//button[.=' Add to Cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='callout callout-success']/span")
	private WebElement message;
	
	//initialization
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	/**
	 * This method is used to double click on plus button
	 * @param web
	 */
	public void doubleClickPlusButton(WebDriverUtility web)
	{
		web.doubleClickOnElement(plusButton);
	}
	/**
	 * This method is used to get hte quantity of added  items.
	 * @return
	 */
	public String getQuantity()
	{
		return quantity.getAttribute("value");
	}
	/**
	 * This method is used to click add to cart button.
	 */
	public void clickAddToCart()
	{
		addToCartButton.click();
	}
	/**
	 * This method is used to get the text on the items added to the cart.
	 * @return
	 */
	public String getMessage()
	{
		return message.getText();
	}
}
