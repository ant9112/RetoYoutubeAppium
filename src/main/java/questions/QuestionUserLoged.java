package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.LoginPage;

public class QuestionUserLoged implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(
				Click.on(LoginPage.PROFILE)
				);
		
		return Text.of(LoginPage.ACCOUNT_NAME).viewedBy(actor).asString();
		
	}
	
	 public static QuestionUserLoged value() { 
		 return new QuestionUserLoged(); 
		 }

}
