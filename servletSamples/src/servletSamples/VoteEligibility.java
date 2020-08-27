package servletSamples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoteEligibility extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		if(age>=18) {
			pw.println("<font color='green' size='4'>"+name+" Your Eligible to Vote</font>");
			
		}else {
			pw.println("<font color='red' size='4'>"+age+" Your Not Eligiblr To Vote</font>");
		}
		   pw.println("<br><br><a href= 'Vote.html'>Home</a>");
	          //close the stream
	          pw.close();
	}

}
