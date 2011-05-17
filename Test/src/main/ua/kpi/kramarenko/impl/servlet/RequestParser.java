package ua.kpi.kramarenko.impl.servlet;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import ua.kpi.kramarenko.api.servlet.commands.Command;
import ua.kpi.kramarenko.impl.servlet.commands.LoginCommand;
import ua.kpi.kramarenko.impl.servlet.commands.NoCommand;
import ua.kpi.kramarenko.impl.servlet.commands.OrderCommand;

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
