package testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddTestingCourseToMyCartTest extends BaseClass {
	@Test
	public void addPythonToMyCart()
	{
		SoftAssert soft =new SoftAssert();
		
		home.clickGearTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		
		demoApp.selectCategory(web,1);
		soft.assertEquals(testing.getPageHeader(),"Testing");
		web.scrollToElement(testing.getPythonImage());
		int initialTotal=Integer.parseInt(testing.getTotal());
		web.dragAndDropElement(testing.getPythonImage(), testing.getMyCart());
		int finalTotal=Integer.parseInt(testing.getTotal());

		soft.assertEquals(finalTotal, initialTotal);
		
		web.scrollToElement(testing.getFacebookIcon());
		
		testing.clickFacebook();
		
		String face=driver.findElement(By.xpath("//span[contains(@class,'xg8j3zb')]")).getText();
		soft.assertEquals(face, "Connect with SkillRary on Facebook");
		
		soft.assertAll();
	}
	
	

}
