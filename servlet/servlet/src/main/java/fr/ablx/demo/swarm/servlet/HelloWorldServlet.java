package fr.ablx.demo.swarm.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/*", displayName = "HelloWorld")
public class HelloWorldServlet extends HttpServlet {

	/**
	 * serialUID.
	 */
	private static final long serialVersionUID = 8243025824616480482L;

	private Logger logger = Logger.getLogger(HelloWorldServlet.class.getName());

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		logger.info("doGet");
		PrintWriter out = resp.getWriter();
		out.print(getObject());
		out.flush();
	}

	private String getObject() {

		return "HelloWorld !";
	}

}
