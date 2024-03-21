package com.data.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import com.data.business.Data;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/diminuiscigiorni")
public class DiminuisciGiorni extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	ObjectMapper objectMapper = new ObjectMapper();

        try {
            BufferedReader reader = request.getReader();
            StringBuilder requestData = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                requestData.append(line);
            }
            reader.close();

            
            Data oldData = new Data();

            JsonNode rootNode = objectMapper.readTree(requestData.toString());

            if (rootNode.has("data")) {
                JsonNode dataNode = rootNode.get("data");
                int giorno = dataNode.get("giorno").asInt();
                int mese = dataNode.get("mese").asInt();
                int anno = dataNode.get("anno").asInt();

                oldData.setGiorno(giorno);
                oldData.setMese(mese);
                oldData.setAnno(anno);
            }

            if (rootNode.has("giorni")) {
                int giorni = rootNode.get("giorni").asInt();
                oldData.diminuisciGiorniDi(giorni);
            }
            
            System.out.println(oldData);

            
            response.setContentType("text/plain");
            response.getWriter().write("Data aggiornata: " + oldData);
        	} catch (IOException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("Errore durante l'aggiornamento");
        }
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        
//    	String dataString1 = request.getParameter("data1");
//        String giorniStringa = request.getParameter("giorni");
//    
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        LocalDate localDate1 = LocalDate.parse(dataString1, formatter);
//        Data data1 = new Data(localDate1.getDayOfMonth(), localDate1.getMonthValue(), localDate1.getYear());
//        
//        int giorniDaDiminuire = Integer.parseInt(giorniStringa);
//        
//        data1.diminuisciGiorniDi(giorniDaDiminuire);
//        
//        ObjectMapper objectMapper = new ObjectMapper();
//        String jsonData = objectMapper.writeValueAsString(data1);
//
//        response.setContentType("application/json");
//        response.getWriter().write(jsonData); 
//        }

}

