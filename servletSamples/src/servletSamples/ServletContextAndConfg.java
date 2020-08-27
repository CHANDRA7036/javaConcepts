package servletSamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextAndConfg extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		out.println("Hii");
		
//Servlet Context		
		ServletContext ctx=getServletContext();
		String str=ctx.getInitParameter("name");
		out.println(str);
		
//Servlet config
//		ServletConfig cg=getServletConfig();
//		String str=cg.getInitParameter("name");
//		out.println(str);
		
	}

}
