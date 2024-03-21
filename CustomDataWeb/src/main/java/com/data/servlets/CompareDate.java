package com.data.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.business.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/comparedate")
public class CompareDate extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	String dataString1 = request.getParameter("data1");
        String dataString2 = request.getParameter("data2");
    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate1 = LocalDate.parse(dataString1, formatter);
        LocalDate localDate2 = LocalDate.parse(dataString2, formatter);

        
        Data data1 = new Data(localDate1.getDayOfMonth(), localDate1.getMonthValue(), localDate1.getYear());
        Data data2 = new Data(localDate2.getDayOfMonth(), localDate2.getMonthValue(), localDate2.getYear());
        
        Data max = data1.maggioreData(data1, data2);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(max);

        response.setContentType("application/json");
        response.getWriter().write(jsonData); 
        }

}

