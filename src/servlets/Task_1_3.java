package servlets;


import models.User;
import service.UserService;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-3")
public class Task_1_3  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form method='post' action='/home-1-3'>" );
        out.print("<label for='name'>Name: </label>" );
        out.print("    <input type='text' name='name'><br><br>" );
        out.print("    <label for='surname'>Surname: </label>" );
        out.print("    <input type='text' name='surname'><br><br>" );
        out.print("    <button>Submit</button>" );
        out.print("</form>");

        out.print("<table border='1'>");
        out.print("<tr><th>Name</th><th>Surname</th></tr>");

        for(User a: UserService.getUsers()){
            out.print("<tr>");
            out.print("<td>" + a.getName() + "</td>");
            out.print("<td>" + a.getSurname() + "</td>");
            out.print("</tr>");
        }

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        User user = new User(name,surname);
        UserService.addUser(user);

        response.sendRedirect("/home-1-3");
    }

}
