package servletSamples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Wishes extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        //write request processing logic to generate wish message
        Calendar cal = Calendar.getInstance();
        //get current hours of the day
        int hour = cal.get(Calendar.HOUR_OF_DAY);//24 hrs format
        //generate wish message
        if(hour<12)
             pw.println("Good Morning!!");
        else if (hour < 16)
             pw.println("Good afternoon");
        else if(hour<20)
             pw.println("Good evening");
        else
             pw.println("Good night");

        pw.println("<br><br><a href= '../Wishes/wish.html'>Home</a>");
        //close stream object
        pw.close();
    }

}
