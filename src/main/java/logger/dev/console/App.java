package logger.dev.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.service.AppService;

public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
	LOG.info("Bonjour Slf4J !");
	LOG.info("Implementation Logback");
	
	AppService appService = new AppService();
	
	appService.executer("Appel de méthode de type FileAppender");
	}

}