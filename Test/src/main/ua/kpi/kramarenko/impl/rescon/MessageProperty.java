package ua.kpi.kramarenko.impl.rescon;

public class MessageProperty {

	public final String LOGIN_ERROR_MESSAGE = "LOGIN_ERROR_MESSAGE";
	public final String SERVLET_EXCEPTION_ERROR_MESSAGE = "SERVLET_EXCEPTION_ERROR_MESSAGE";
	public final String IO_EXCEPTION_ERROR_MESSAGE = "IO_EXCEPTION_ERROR_MESSAGE";

	private static MessageProperty instance = null;

	public static MessageProperty getInstance() {
		if (instance == null) {
			instance = new MessageProperty();
		}
		return instance;
	}

}
