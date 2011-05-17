package ua.kpi.kramarenko.servlet.commands;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;


public class RequestParser {
	
	public static final String COMMAND_NAME = "command";

	public static RequestParser getInstance() {
		if (instance == null)
			instance = new RequestParser();
		return instance;
	}
	
	public Command getCommand (HttpServletRequest request) {
		String action = request.getParameter(COMMAND_NAME);
		Command command = commands.get(action);
		if (command == null)
			command = new NoCommand();
		return command;
	}
	
	private static RequestParser instance = null;
	
	private RequestParser() {
		commands.put(LoginCommand.ATTRIBUTE_NAME, new LoginCommand());
		commands.put(OrderCommand.ATTRIBUTE_NAME, new OrderCommand());
	}
	
	private HashMap<String, Command> commands = new HashMap<String, Command>();
}
