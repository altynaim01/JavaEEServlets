package servlets;


import models.FoodOrder;
import service.UserService;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-4")
public class Task_1_4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        out.print("<form method='post' action='/home-1-4'>");
        out.print("    <label for='name'>Name: </label>");
        out.print("    <input type='text' name='name'><br><br>" );
        out.print("    <label for='surname'>Surname: </label>" );
        out.print("    <input type='text' name='surname'><br><br>" );
        out.print("    <label for='food'>Food: </label>");
        out.print("    <select name='food'>");
        out.print("         <option value='Manty - 900 tg'>Manty - 900 tg</option>");
        out.print("        <option value='Soup - 1000 tg'>Soup - 1000 tg</option>");
        out.print("        <option value='Besh - 2000 tg'>Besh - 2000 tg</option>");
        out.print("    </select>");
        out.print("    <button>Submit</button>");
        out.print("</form>");


        for (FoodOrder a : UserService.getOrders()) {
            out.print("<p>" + a.getSurname() + " " + a.getName() + " ordered " + a.getOrder() + "</p>");
        }

        out.print("</body>");
        out.print("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String food = request.getParameter("food");

        FoodOrder foodOrder = new FoodOrder(name, surname, food);
        UserService.addOrder(foodOrder);

        response.sendRedirect("/home-1-4");
    }

}
