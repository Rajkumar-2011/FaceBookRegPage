package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class SignUpTest extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		BaseClass.initialiazation();
		Thread.sleep(3000);
		LoginPage signup=new LoginPage();
		Thread.sleep(3000);
		signup.createAccount("Atharva", "Rajkumar", "12", "Nov", "2020","123563269","adam@123");
		Thread.sleep(3000);
		driver.quit();
	}

}
