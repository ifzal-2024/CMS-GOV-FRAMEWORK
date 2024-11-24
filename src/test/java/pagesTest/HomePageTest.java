package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	// The test executed based on alphabetical order, if no priority given for couple of tests
		// (enabled = true) means The test case is not disable, it can run
		// (enabled = false) means The test case is disable, it is not running
		// priority = 1 means, this test case will run first, 2 means second .... ... so on
		
		@Test (enabled = false, priority = 1)
		public void clickLogoTest() {
			homePage.clickLogo();
		}
		
		@Test //(enabled = false, priority = 4)
		public void clickLoginButtonTest() throws InterruptedException  {
			homePage.clickLoginButton();
		}
		
		@Test (enabled = false, priority = 2)
		public void clickUserIdTest() {
			homePage.clickUserId(); 
		}
		
		@Test (enabled = false, priority = 3)
		public void clickPasswordTest() {
			homePage.clickPassword();
		}
		
		@Test (enabled = false)
		public void clickNewUserRegistrationTest() {
			homePage.clickNewUserRegistration();
		}
		
		
		
		@Test(enabled = false)
		public void clickUnlockTest() throws InterruptedException {
			homePage.clickUnlock();
		}


		@Test(enabled = false)
		public void inputTextInUserIdFieldTest () {
			homePage.inputTextInUserIdField();
		}
		
		
		@Test(enabled = true)
		public void inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyToTheLoginButtonTest() {
			homePage.inputTextInUserIdAndPasswordFieldThenClickIAgreeAndFinallyToTheLoginButton();
		}
		
		@Test(enabled =false )
		public void useOfByClassInLoginProcessTest() throws InterruptedException {
			homePage.useOfByClassInLoginProcess();
		}
		
		@Test
		public void use_of_linkText_as_locator_in_forgot_userId_hyperlink_test() {
			homePage.use_of_linkText_as_locator_in_forgot_userId_hyperlink();
		}
		
		@Test
		public void use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink_test() {
			homePage.use_of_partialLinkText_as_locator_in_forgot_passowrd_hyperlink();
		}
		
		
		@Test
		public void why_we_use_cssSelector_as_locator_in_logo_test () {
			homePage.why_we_use_cssSelector_as_locator_in_logo();
		}
		
		@Test
		public void role1a_use_of_cssSelector_by_class_name_value_test() {
			homePage.role1a_use_of_cssSelector_by_class_name_value();;
		}
		
		@Test
		public void role2a_use_of_cssSelector_by_id_value_test() {
			homePage.role2a_use_of_cssSelector_by_id_value();
		}
		
		
		@Test// Failed
		public void role1b_use_of_cssSelector_by_class_name_value_test() {
			homePage.role1b_use_of_cssSelector_by_class_name_value();
		}
		
		@Test
		public void role2b_use_of_cssSelector_by_id_value_test (){
			homePage.role2b_use_of_cssSelector_by_id_value();
		}
		
		
		@Test
		public void role3_use_of_cssSelector_by_compund_class_name_value_test () {
			homePage.role3_use_of_cssSelector_by_compund_class_name_value();
			
		}
		@Test
		public void role4_use_of_cssSelector_by_attribute_and_its_value_test() {
			homePage.role4_use_of_cssSelector_by_attribute_and_its_value();
		}
		
		
		@Test
		public void role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value_test() {
			homePage.role5_use_of_cssSelector_by_class_name_value_and_attribute_and_its_value();
		}
		
		@Test
		public void role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value_test() {
			homePage.role6_use_of_cssSelector_by_id_value_and_attribute_and_its_value();
			
		}
		
		@Test
		public void use_of_tagName_as_locator_test() {
			homePage.use_of_tagName_as_locator();
		}
		
		@Test
		public void use_of_isDisplayed_01_test() {
			homePage.use_of_isDisplayed_01();
		}
		
		@Test
		public void use_of_isDisplayed_02_test() {
			homePage.use_of_isDisplayed_02();
		}
		
		@Test
		public void use_of_isDisplayed_in_login_test () {
			homePage.use_of_isDisplayed_in_login();
			
		}
		
		
		@Test
		public void use_of_isSelected_in_login_test() {
			homePage.use_of_isSelected_in_login();
		}
		
		@Test
		public void use_of_isEnabled_in_login_test () { 
			homePage.use_of_isEnabled_in_login();
		}
		
}
