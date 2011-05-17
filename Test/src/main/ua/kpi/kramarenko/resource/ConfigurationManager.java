package ua.kpi.kramarenko.resource;

import java.util.ResourceBundle;


public class ConfigurationManager {

	public static ConfigurationManager getInstance() {
		if (instance == null) {
			instance = new ConfigurationManager();
			instance.resourceBundle = ResourceBundle
					.getBundle(Property.config.BUNDLE_NAME);
		}
		return instance;
	}

	private ConfigurationManager() {
	}

	public String getProperty(String key) {
		return (String) resourceBundle.getObject(key);
	}

	private static ConfigurationManager instance = null;
	private ResourceBundle resourceBundle;

}
