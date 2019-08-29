package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterfaces.LoginPage;

public class LoginTask  implements Task {

	
	public static String usernameIn;
	public static String passwordIn;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(LoginPage.PROFILE),
				Click.on(LoginPage.SIGN_IN),
				Click.on(LoginPage.ADD_ACCOUNT),
				
//				WaitUntil.the(LoginPage.EMAIL_FIELD, isVisible()),
//
//				WaitUntil.the(LoginPage.EMAIL_FIELD, isCurrentlyEnabled()),
//				WaitUntil.the(LoginPage.EMAIL_FIELD, isClickable()),
			
				WaitUntil.the(LoginPage.EMAIL_FIELD, isEnabled()).forNoMoreThan(30).seconds(),
				Enter.theValue(usernameIn).into(LoginPage.EMAIL_FIELD),
				
				//WaitUntil.the(LoginPage.NEXT, isEnabled()),
				WaitUntil.the(LoginPage.NEXT, isEnabled()).forNoMoreThan(30).seconds(),
				Click.on(LoginPage.NEXT),
				
				WaitUntil.the(LoginPage.PASSWORD_FIELD, isEnabled()).forNoMoreThan(30).seconds(),
				WaitUntil.the(LoginPage.PASSWORD_FIELD, isClickable()).forNoMoreThan(30).seconds(),
				Enter.theValue(passwordIn).into(LoginPage.PASSWORD_FIELD),
				
				WaitUntil.the(LoginPage.NEXT, isEnabled()).forNoMoreThan(30).seconds(),
				WaitUntil.the(LoginPage.NEXT, isClickable()).forNoMoreThan(30).seconds(),
				Click.on(LoginPage.NEXT),
				
				WaitUntil.the(LoginPage.AGREE, isEnabled()).forNoMoreThan(30).seconds(),
				WaitUntil.the(LoginPage.AGREE, isClickable()).forNoMoreThan(30).seconds(),
				Click.on(LoginPage.AGREE),
				
				WaitUntil.the(LoginPage.ACCEPT, isEnabled()).forNoMoreThan(30).seconds(),
				WaitUntil.the(LoginPage.ACCEPT, isClickable()).forNoMoreThan(30).seconds(),
				Click.on(LoginPage.ACCEPT));
	}
	
	
	public static LoginTask loginWith(String username, String password) {
		usernameIn= username;
		passwordIn = password;
		return instrumented(LoginTask.class, username, password);
    }
}