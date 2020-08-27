package servletSamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("Hii");
		javax.servlet.ServletContext ctx= getServletContext();
		String str=ctx.getInitParameter("name");
		out.println(str);
	}

}
