/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dani.examenmaven;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


/**
 * Clase con métodos para sacar el título de una web y para sacar código HTML.
 * @author dani
 */
public class Metodos{
    /**
     * Método para sacar el título de "https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP
     */
    public static void sacarTitulo(){
        try{
            Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            String title = doc.title();
            System.out.println(title);
        }catch(IOException ex){
            System.out.println("Error:"+ex);
        }
    }
    /**
     * Método para sacar el tiempo actual en Vigo.
     */
    public static void pasarTiempo(){
        try{
            Document doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            String tiempo=doc.select(".today_nowcard-phrase").text();
            String temperatura=doc.select(".today_nowcard-temp").text();
            System.out.println(tiempo);
            System.out.println(temperatura);
        }catch(IOException ex){
            System.out.println("Error:"+ex);
        }

    }
}
