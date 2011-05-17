/**
 * 
 */
package ua.kpi.kramarenko.impl.servlet.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kpi.kramarenko.api.servlet.commands.Command;

/**
 * @author mathan
 *
 */
public class OrderCommand implements Command {

	public static final String ATTRIBUTE_NAME = "order";
	
	
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return null;
	}


}
