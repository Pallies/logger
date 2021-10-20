package dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import logger.dev.console.Test;

public class AppService {
	private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

	/**
	 * @param param
	 */
	public void executer(String param) {
		LOG.trace("Traitement 1 : param = {}", new Test("TRACE"));
		LOG.debug("Traitement 1 : param = {}", new Test("DEBUG"));
		LOG.info("Traitement 1 : param = {}", new Test("INFO"));
		LOG.warn("Traitement 1 : param = {}", new Test("WARN"));
		LOG.error("Traitement 1 : param = {}", new Test("ERROR"));

//	pas trouver de référence FATAL
//	LOG.fatal("Traitement 1 : param = {}", new Test("FATAL"));
	}

}
