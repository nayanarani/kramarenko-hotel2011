package ua.kpi.kramarenko.impl.rescon;

import java.util.ResourceBundle;

public class MessageManager {
	
    public static MessageManager getInstance(){
        if (instance == null){
            instance = new MessageManager();
            instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
        }
        return instance;
    }
    
    private MessageManager(){
    	
    }
    
    public String getProperty(String key){
        return (String)resourceBundle.getObject(key);
    }
	private static MessageManager instance;
	private ResourceBundle resourceBundle;
	private static final String BUNDLE_NAME = "ua.kpi.kramarenko.properties.messages";
}
