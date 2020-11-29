/* JobPostingCSVWriter Class
 * Description: A csv file writer specifically for 'job postings'
 * Authors: Omar Sabbagh, Darius Zhou
 * Latest Update: November 28, 2020
 * Version: v1.0
*/

import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.jsoup.*;

public class JobPostingCSVWriter {
	//attributes
	private String filename;
	private String msg;
	private ArrayList<JobPosting> list;
	
	//overloaded constructor
    public JobPostingCSVWriter(String fn, ArrayList<JobPosting> jp) {
    	setFilename(fn + ".csv");
    	msg = "Title, Category, Contact, Link, Description";
    	list = jp;
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
    
    public String parseJobPostings() {
    	for (int i = 0; i < list.size(); i++) {
    		addJobPosting(list.get(i));
    	}
    	return msg;
    }
    
    // Adds a job posting to the msg string
	public JobPosting addJobPosting(JobPosting jp) {
		msg += "\n";
		addToMsg(jp.getTitle());
		addToMsg(jp.getCategory());
		addToMsg(jp.getContact());
		addToMsg(jp.getLink());
		addToMsg(Jsoup.parse(jp.getDescription()).text());
		
		return jp;
	}
	
	// Writes the msg string into a CSV file
	public void writeCSV() {
        try (FileWriter file = new FileWriter(filename)) {
            file.write(msg);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("CSV File generated.");
	}
	
	//helper methods
	// Adds a 'cell' to the msg string
	private String addToMsg(String c) {
		msg += c + ",";
		return c;
	}
}
