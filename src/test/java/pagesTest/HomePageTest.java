package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
@Test
public void clickForgotUserIdTest() throws InterruptedException   {
	homePage.clickForgotUserId();
}

@Test (enabled = true, priority = 2)
public void clickUserIdTest() {
	homePage.clickUserId();
}



}
