package ua.kpi.kramarenko.impl.servlet.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kpi.kramarenko.api.servlet.commands.Command;
import ua.kpi.kramarenko.impl.rescon.Property;
import ua.kpi.kramarenko.impl.rescon.ResourceManager;

public class NoCommand implements Command {

	
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		return ResourceManager.config.getProperty(Property.config.MAIN_PAGE_PATH);
	}

}
