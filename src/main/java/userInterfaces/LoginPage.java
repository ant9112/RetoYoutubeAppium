package userInterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static Target MAIN_SCREEN = Target.the("MAIN SCREEN").located(By.id("com.google.android.youtube:id/youtube_logo"));
	
	public static Target PROFILE = Target.the("PROFILE").located(By.xpath("//android.widget.ImageView[@content-desc=\"Account\"]"));
	
	public static Target SIGN_IN = Target.the("SIGN IN").located(By.id("com.google.android.youtube:id/button"));
	
	public static Target ADD_ACCOUNT = Target.the("ADD ACCOUNT").located(By.id("com.google.android.youtube:id/name"));
	
	public static Target EMAIL_FIELD = Target.the("EMAIL FIELD").located(By.xpath("//android.view.View[1]/android.widget.EditText"));
	
	public static Target PASSWORD_FIELD = Target.the("PASSWORD FIELD").located(By.xpath("//android.view.View[1]/android.widget.EditText"));
	
	public static Target NEXT = Target.the("NEXT").located(By.xpath("//*[@text = \"Next\" or @content-desc=\"Next\"]"));
	
	public static Target AGREE = Target.the("AGREE").located(By.xpath("//*[@text = \"I agree\"  or @content-desc=\"I agree\" ]"));
	
	public static Target SYNCRONIZE = Target.the("SYNCRONIZE").located(By.id("com.google.android.gms:id/sud_items_switch"));
	
	public static Target ACCEPT = Target.the("ACCEPT").located(By.xpath("//*[@text = \"ACCEPT\" or @content-desc=\"ACCEPT\"]"));
	
	public static Target ACCOUNT_NAME = Target.the("ACCOUNT NAME").located(By.id("com.google.android.youtube:id/account_name"));


}
