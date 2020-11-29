/* JobPostingJSONWriter Class
 * Description: A json file writer specifically for 'job postings'
 * Authors: Omar Sabbagh, Darius Zhou
 * Latest Update: November 28, 2020
 * Version: v1.0
*/

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.jsoup.*;

public class JobPostingJSONWriter {
	//attributes
	private String filename;
    private JSONArray jplist;
    private ArrayList<JobPosting> jpscraped;
    
    //overloaded constructor
    public JobPostingJSONWriter(String fn, ArrayList<JobPosting> jp) {
    	setFilename(fn + ".json");
    	jpscraped = jp;
    	jplist = new JSONArray();
    }
    
    //access methods
    // Sets the file name; no invalid option
    public String setFilename(String fn) {
    	filename = fn;
    	return filename;
    }
    
    // Gets the file name
    public String getFilename() {
    	return filename;
    }
    
    // Adds all job postings to JSONArray
    public JSONArray parseJobPostings() {
    	for (int i = 0; i < jpscraped.size(); i++) {
    		addJobPosting(jpscraped.get(i));
    	}
    	return jplist;
    }
    
    // Adds a job posting to the JSONArray
	public JobPosting addJobPosting(JobPosting jp) {
		JSONObject post = new JSONObject();
		
        post.put("Title", jp.getTitle());
        post.put("Category", jp.getCategory());
        post.put("Contact", jp.getContact());
        post.put("Description", Jsoup.parse(jp.getDescription()).text());
        post.put("Link", jp.getLink());
        
        jplist.add(post);
        return jp;
	}
	
	// Writes job postings into a JSON file
	public String writeJSON() {
        try (FileWriter file = new FileWriter(filename)) {
            file.write(jplist.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("JSON File generated.");
        
        return filename;
	}
}
