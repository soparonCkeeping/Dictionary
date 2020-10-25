/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.exceptions.UnirestException;
import jdk.nashorn.internal.parser.JSONParser;



public class NewClass {
    
   public String Texttranslate (String targetText, String status) throws UnirestException {
    String last;   
    if (status.equals("VI - E")){
        last = "en";
    }   
    else {
        last = "vi";
    }
       System.out.println(last);
       //encode cchuyeenr từ string -> url
    String urlkk = targetText;
    urlkk = urlkk.replaceAll(" ", "%20");
    urlkk = urlkk.replaceAll(",", "%2C");
    System.out.println(urlkk);
    // truyền json sang string
    HttpResponse<JsonNode> response = Unirest.get("https://rapidapi.p.rapidapi.com/translateLanguage/translate?text="
        + urlkk
        + "&type=plain&target=" + last)
	.header("x-rapidapi-host", "language-translation.p.rapidapi.com")
	.header("x-rapidapi-key", "1ac6d6fce9msh437737836398366p109822jsn0878700a0ccf")
	.asJson();
    
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      JsonParser jp = new JsonParser();
      JsonElement je = jp.parse(response.getBody().toString());
      String prettyJsonString = gson.toJson(je);
      System.out.println(prettyJsonString);  
       //xu ly string day
      return prettyJsonString;
   }
}
