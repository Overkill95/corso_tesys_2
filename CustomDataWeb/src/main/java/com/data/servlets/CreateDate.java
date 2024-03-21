package com.data.servlets;

import java.io.BufferedReader;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.business.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/createdate")
public class CreateDate extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Data oldData = new Data();
       
        BufferedReader reader = request.getReader();
        StringBuilder requestData = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            requestData.append(line);
        }
        reader.close();
        
       
        ObjectMapper objectMapper = new ObjectMapper();
        Data newData = objectMapper.readValue(requestData.toString(), Data.class);
        
        
        oldData.setGiorno(newData.getGiorno());
        oldData.setMese(newData.getMese());
        oldData.setAnno(newData.getAnno());
        
      
        response.setContentType("text/plain");
        response.getWriter().write("Data aggiornata con successo");
    }

  //    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        
//    	int day = Integer.parseInt(request.getParameter("day"));
//        int month = Integer.parseInt(request.getParameter("month"));
//        int year = Integer.parseInt(request.getParameter("year"));
//
//        Data data = new Data(day, month, year);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonData = objectMapper.writeValueAsString(data);
//
//        response.setContentType("application/json");
//        response.getWriter().write(jsonData);
//    }

}

