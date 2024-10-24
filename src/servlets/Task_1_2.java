package servlets;


import models.User;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/home-1-2")
public class Task_1_2  extends HttpServlet{
    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        ArrayList<User> users = new ArrayList<>();

        users.add(new User("John", "Doe", "Development", 60000));
        users.add(new User("Jane", "Smith", "Marketing", 50000));
        users.add(new User("Michael", "Johnson", "Sales", 55000));
        users.add(new User("Emily", "Davis", "HR", 48000));
        users.add(new User("David", "Wilson", "IT", 75000));

        PrintWriter out = response.getWriter();
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Surname</th><th>Department</th><th>Salary</th></tr>");

        for (User user : users) {
            out.println("<tr>");
            out.println("<td>" + user.getName() + "</td>");
            out.println("<td>" + user.getSurname() + "</td>");
            out.println("<td>" + user.getDepartment() + "</td>");
            out.println("<td>" + user.getSalary() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");





    }

}
