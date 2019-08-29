package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userInterfaces.LoginPage;

public class LoadApplication implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		LoginPage.MAIN_SCREEN.resolveFor(actor).isVisible();
	}
	
	public static LoadApplication loadApplication() {
        return new LoadApplication();
    }
}
