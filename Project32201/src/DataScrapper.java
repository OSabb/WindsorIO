/* DataScrapper Class
 * Description: Defines the basic requirements of a data scrapper
 * Author: Darius Zhou
 * Latest Update: November 23, 2020
 * Version: v1.0
*/

import java.net.URL;
import java.util.*;
import org.json.*;

abstract class DataScrapper {
	//attributes
	protected URL u;
	//protected ArrayList<Object> records;
	protected JSONArray ja;
	
	//overloaded constructor
	public DataScrapper(URL link) {
		setURL(link);
		ja = new JSONArray();
	}
	
	//access methods
	// Sets the URL/link; no valid option
	public URL setURL(URL link) {
		u = link;
		return u;
	}
	
	// Gets the URL/link
	public URL getURL() {
		return u;
	}
	
	// Gets the array of job postings
	/*public ArrayList<Object> getRecords() {
		return records;
	}*/
	
	// Gets the JSON array
	public JSONArray getJSONArray() {
		return ja;
	}
	
	//helper methods
	// Stores data into the job postings array list
	protected JSONArray parseData() {
		for(int i = 0; !ja.isNull(i); i++) {
			insertData(ja.getJSONObject(i));
		}
		
		return ja;
	}
	
	//abstract methods
	// Generates and stores the array list of records
	//abstract ArrayList<Object> scrapeData();
	// Inserts new data into the JSON array and array list of records
	abstract JSONObject insertData(JSONObject jo);
}
