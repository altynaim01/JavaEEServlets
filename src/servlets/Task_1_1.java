package servlets;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import java.io.PrintWriter;

@WebServlet(value = "/home-1-1")
public class Task_1_1  extends HttpServlet{
    @Override

    protected void doGet(HttpServletRequest request,

                         HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        for(int i=0;i<10;i++){
            out.print("<h1>HELLO BITLAB</h1>");
        }



    }

}
