package servlets;


import models.Footballer;
import service.UserService;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-7")
public class Task_1_7 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");


        out.println("<form method='post' action='/home-1-7'>" +
                "    <label>Name: </label>" +
                "    <input type='text' name='name'><br><br>" +
                "    <label>Surname: </label>" +
                "    <input type='text' name='surname'><br><br>" +
                "    <label>Club: </label>" +
                " <select name='club'>" +
                "        <option value='realMadrid'>Real Madrid</option>" +
                "        <option value='barselona'>Barselona</option>" +
                "        <option value='psj'>PSJ</option>" +
                "    </select>" + "<br><br>" +
                "    <label>Salary: </label>" +
                "    <input type='number' name='salary'><br><br>" +
                "    <label>Transfer price: </label>" +
                "    <input type='number' name='transfer'><br><br>" +
                "    <button>Add footballer</button>" +
                "</form>");

        for (Footballer a : UserService.getFootballers()) {
            out.println("<h2>" + a.getName() + " " + a.getSurname() + "</h2>" +
                    "<p style='color: blue'>Club:" + a.getClub() + " </p>" +
                    "<p style='color: darkred'>Salary: " + a.getSalary() + "EUR</p>" +
                    "<p style='color: darkred'>Transfer price: " + a.getTransferPrice() + "EUR</p> <br>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String club = request.getParameter("club");
        double salary = Double.parseDouble(request.getParameter("salary"));
        double transferPrice = Double.parseDouble(request.getParameter("transfer"));

        Footballer footballer = new Footballer(name, surname, (int) salary, club, (int) transferPrice);
        UserService.addFootballer(footballer);

        response.sendRedirect("home-1-7");

    }

}
