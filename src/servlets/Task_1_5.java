package servlets;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-5")
public class Task_1_5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");


        out.println("<form method='post' action='/home-1-5'>" +
                "    <label>Fullname: </label>" +
                "    <input type='text' name='fullname'><br><br>" +
                "    <label>Age: </label>" +
                "    <input type='number' name='age'><br><br>" +
                "    <label>Gender: </label>" +
                "    <label>" +
                "        <input type='radio' name='gender' value='male'>" +
                "        Male" +
                "    </label>" +
                "    <label>" +
                "        <input type='radio' name='gender' value='female'>" +
                "        Female" +
                "    </label>" +
                "    <button>Send</button>" +
                "</form>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");
        String fullname = request.getParameter("fullname");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");

        String res = "Hello ";
        res += (age < 18) ? " Dude" : " Dear";
        res += (gender.equalsIgnoreCase("male") ? " Mister" : " Miss");
        out.println("<p>" + res + " " + fullname + "! " + "</p>");

        out.println("<a href='/home-1-5'>Go back</a>");


    }

}
