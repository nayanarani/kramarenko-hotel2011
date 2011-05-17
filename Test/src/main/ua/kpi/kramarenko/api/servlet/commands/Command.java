package ua.kpi.kramarenko.api.servlet.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command { 

	public abstract String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException;
}