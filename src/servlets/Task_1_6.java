package servlets;


import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-6")
public class Task_1_6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("</head>");
        out.print("<body>");


        out.println("<form method='post' action='/home-1-6'>" +
                "    <label>Fullname: </label>" +
                "    <input type='text' name='fullname'><br><br>" +
                "    <label>Exam points: </label>" +
                "    <input type='number' name='point'><br><br>" +
                "    <button>Submit exam</button>" +
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
        int point = Integer.parseInt(request.getParameter("point"));
        String res = "";
        if(point >=90){
            res = "A";
        }
        else if(75 <= point && point <= 89){
            res = "B";
        }
        else if(60 <= point && point <= 74){
            res = "C";
        }
        else if(50 <= point && point <= 59){
            res = "D";
        }
        else{
            res = "F";
        }


        out.println("<p>" + fullname + " got " + res + " for exam! " + "</p>");

        out.println("<a href='/home-1-6'>Go back</a>");


    }

}
