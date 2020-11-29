/* JPDataScrapper Class
 * Description: A data scrapper for job postings
 * Author: Darius Zhou
 * Latest Update: November 23, 2020
 * Version: v1.0
*/

import java.net.URL;
import java.io.*;
import java.util.*;
import org.json.*;

public class JPDataScrapper extends DataScrapper {
	//attributes
	private ArrayList<JobPosting> jpostings;
	
	//overloaded constructor
	public JPDataScrapper(URL link) {
		super(link);
		jpostings = new ArrayList<JobPosting>();
	}
	
	//access methods
	// Gets the job posting array list
	public ArrayList<JobPosting> getJobPostings() {
		return jpostings;
	}
	
	//process methods
	// Scrapes the data from the URL/link provided into a JSON array
	public ArrayList<JobPosting> scrapeData() {
		try {
			Scanner sc = new Scanner(u.openStream());
			ja = new JSONArray(sc.nextLine());
			sc.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		parseData();
		
		return jpostings;
	}
	
	// Inserts data directly into the array list
	public JSONObject insertData(JSONObject jo) {
		JobPosting jp = new JobPosting(jo.getString("title"),jo.getString("category"),
				jo.getString("contact"),jo.getString("description"),jo.getString("link"));
		jpostings.add(jp);
		
		return jo;
	}
}
