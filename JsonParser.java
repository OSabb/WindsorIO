/*
 * @author:         Omar Sabbagh
 *
 * A simple code snippet for parsing JSON data from a URL
 */
package DataScraper;      
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParser {
   
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        
        try {        
            URL oracle = new URL("https://opendata.citywindsor.ca/api/jobpostings/ets"); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
           
            String inputLine;
            while ((inputLine = in.readLine()) != null) {              
                JSONArray a = (JSONArray) parser.parse(inputLine);
               
                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    String id = (String) tutorials.get("title");
                    System.out.println("Job title  : " + id);

                    String title = (String) tutorials.get("category");
                    System.out.println("Category: " + title);
                    
                   // String description = (String) tutorials.get("description");
                    //System.out.println("description: " + description);
                    
                    
                    System.out.println("\n");
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }  
}