package ua.kpi.kramarenko.servlet.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kpi.kramarenko.resource.Property;
import ua.kpi.kramarenko.resource.ResourceManager;

public class NoCommand implements Command {

	
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		return ResourceManager.config.getProperty(Property.config.MAIN_PAGE_PATH);
	}

}
