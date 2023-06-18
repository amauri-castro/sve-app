/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amauri.sve.app.sve.app.service;

import com.amauri.sve.app.sve.app.dto.Cliente;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amauri
 */
public class ClienteService {
    
    public List<Cliente> listarTodos() throws MalformedURLException, IOException{
        
          String url = "http://localhost:8080/clientes";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "sve-app");
        int responseCode = con.getResponseCode();

        List<Cliente> list = new ArrayList<>();

        System.out.println("GET Response Code : " + responseCode + " : " + url);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            list = new ObjectMapper().readValue(response.toString(), new TypeReference<List<Cliente>>() {
            });

        }
        return list;

    }
}
