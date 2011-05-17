package ua.kpi.kramarenko.resource;

public class ConfigurationProperty {
	
	public final String BUNDLE_NAME = "ua.kpi.kramarenko.properties.config";
	
	public final String DATABASE_TYPE = "DATABASE_TYPE";
	public final String DATABASE_DRIVER_NAME = "DATABASE_DRIVER_NAME";
	public final String DATABASE_URL = "DATABASE_URL";
	public final String DATABASE_USER = "DATABASE_USER";
	public final String DATABASE_PASSWORD = "DATABASE_PASSWORD";
	public final String MAX_ACTIVE = "MAX_ACTIVE";
	public final String MAX_IDLE = "MAX_IDLE";
	public final String MIN_IDLE = "MIN_IDLE";
	public final String MAX_WAIT = "MAX_WAIT";
	public final String ERROR_PAGE_PATH = "ERROR_PAGE_PATH";
	public final String MAIN_PAGE_PATH = "MAIN_PAGE_PATH";
	public final String ORDER_PAGE_PATH = "ORDER_PAGE_PATH";
	
	private static ConfigurationProperty instance = null;
	 
	public static ConfigurationProperty getInstance() {
		if (instance == null) {
			instance = new ConfigurationProperty();
		}
		return instance;
		
	}
	
	private ConfigurationProperty(){
		
	}

}
