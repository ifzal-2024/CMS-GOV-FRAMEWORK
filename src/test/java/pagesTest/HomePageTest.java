package pagesTest;

import java.awt.AWTException;

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
		
		@Test (enabled = true)
		public void clickNewUserRegistrationTest() {
			homePage.clickNewUserRegistration();
		}
		
		
		
		@Test(enabled = false)
		public void clickUnlockTest() throws InterruptedException {
			homePage.clickUnlock();
		}


		@Test(enabled = true)
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
		
		@Test
		public void getMethodsOfThePageTest() {
			homePage.getMethodsOfThePage();
		}
		
		@Test
		public void newUserRegistrationPageValidationTest() {
			homePage.newUserRegistrationPageValidation();
		}
		
		@Test
		public void use_of_getAttribute_methodTest () {
			homePage.use_of_getAttribute_method();
		}
		
		@Test
		public void use_of_clear_in_login_test() {
			homePage.use_of_clear_in_login();
		}
		
		@Test
		public void use_of_navigate_method_test () {
			homePage.use_of_navigate_method();
		}
		
		
		@Test()
		public void use_of_mouse_hoverAction_on_ourLocations_test () {
			homePage.use_of_mouse_hoverAction_on_ourLocations ();
		}
		
		@Test
		public void switch_between_window_test(){
			homePage.switch_between_window();
		}
		
		@Test() // Raw way
		public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_test_01 () {
			homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_01();
		}
		
		@Test// common Actions way
		public void use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02_test () {
			homePage.use_of_sendKeys_method_then_click_by_enter_key_of_the_laptop_02();
		}
		
		
		@Test
		public void use_of_sendKeys_method_then_click_by_return_key_of_the_laptop_test () {
			homePage.use_of_sendKeys_method_then_click_by_return_key_of_the_laptop();
		}
		
		
		@Test
		public void use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop_test () {
			homePage.use_of_sendKeys_method_then_click_by_tab_key_of_the_laptop();
			
		}
		
		@Test()
		public void alternate_of_click_method_test() {
			homePage.alternate_of_click_method();
		}
		
		@Test()
		public void alternate_of_send_keys_method_test() {
			homePage.alternate_of_send_keys_method();
		}
		
		@Test()
		public void login_process_by_JavascriptExecutor__common_method_test() {
			homePage.login_process_by_JavascriptExecutor_common_method();
		}
		
		@Test
		public void how_to_handle_hidden_element_by_regular_selenium_method_test() {
		homePage.how_to_handle_hidden_element_by_regular_selenium_method();
		
		}
		
		
		@Test
		public void how_to_handle_hidden_element_by_javascriptExecutor_test_01() {
			homePage.how_to_handle_hidden_element_by_javascriptExecutor_01();
		}
		
		
		
		@Test
		void how_to_handle_hidden_element_by_javascriptExecutor_02_test() {
		homePage.how_to_handle_hidden_element_by_javascriptExecutor_02();
						
		}
		
		@Test
		public void use_of_scroll_down_and_up_by_actions_class_test() {
		homePage.use_of_scroll_down_and_up_by_actions_class();
		}
		
		
		@Test
		public void use_of_scroll_down_and_scroll_up_by_robot_class () throws InterruptedException, AWTException {
			homePage.use_of_scroll_down_and_scroll_up_by_robot_class();
		}
		
		
		@Test
		public void use_of_scroll_down_and_up_In_A_Certain_Pixel_by_javascriptExecutor_test () {
			homePage.use_of_scroll_down_and_up_In_A_Certain_Pixel_by_javascriptExecutor();
		}
		
		@Test
		public void scroll_into_view_the_element_test() {
			homePage.scroll_into_view_the_element();
		}
		
		@Test
		public void scroll_into_view_the_element_by_commonActions_test() {
			homePage.scroll_into_view_the_element_by_commonActions();
		}
		
		

		@Test
		public void web_based_alert_accept_test () {
			homePage.web_based_alert_accept();		
		}
		
		@Test
		public void web_based_alert_dismiss_test () {
			homePage.web_based_alert_dismiss();		
		}
		

		
		@Test
		public void  authentication_pop_up_test () throws InterruptedException {
			homePage. authentication_pop_up ();
		}
		
		
		
		
		
		
}

