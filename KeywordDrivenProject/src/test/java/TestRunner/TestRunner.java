package TestRunner;

import KeywordEngine.KeywordEngine;
import TestBase.TestBase;

public class TestRunner {

	public static void main(String[] args) {
		TestBase base = new TestBase();
		/*
		 * base.execute("open_Browser", "NA", "NA", "openbrowser", "chrome");
		 * base.execute("enter_the_url", "NA", "NA", "enterurl",
		 * "https://opensource-demo.orangehrmlive.com/"); base.execute("enter_username",
		 * "id", "txtUsername", "sendkeys", "Admin"); base.execute("enter_password",
		 * "id", "txtPassword","sendkeys", "admin123");
		 * base.execute("clickloginButtion", "id", "btnLogin", "click", "NA");
		 */

		KeywordEngine ke = new KeywordEngine();
		ke.readData();
		
		
	}

}
