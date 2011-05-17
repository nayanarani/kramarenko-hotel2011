package ua.kpi.kramarenko.impl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.kpi.kramarenko.api.servlet.commands.Command;
import ua.kpi.kramarenko.impl.rescon.Property;
import ua.kpi.kramarenko.impl.rescon.ResourceManager;


/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final String errorMessageAttribute = "errorMessage";

	private RequestParser requestParser = RequestParser.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	private void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String page = null;
		try {
			Command command = requestParser.getCommand(request);
			page = command.execute(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
			request.setAttribute(
					errorMessageAttribute,
					ResourceManager.message
							.getProperty(Property.message.SERVLET_EXCEPTION_ERROR_MESSAGE));
			page = ResourceManager.config.getProperty(Property.config.ERROR_PAGE_PATH);
		}

		RequestDispatcher dispatcher = getServletContext()
				.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
