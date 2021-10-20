package logger.dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class de test pour 
 * l'utilisation d'un object passer en paramètre
 * à la Class static LOG
 * @author Yvan Palliès
 *
 */
public class Test {

	private static final Logger LOGGER_TEST= LoggerFactory.getLogger("Test");
	private StringBuilder chaine = new StringBuilder();

	public Test(String message) {
		LOGGER_TEST.warn("Création de l'objet Test.class");
	chaine.append(message).append(" in ").append(this.getClass());
	}

	@Override
	public String toString() {
		return "Test [chaine=" + chaine + "]";
	}
	
}
