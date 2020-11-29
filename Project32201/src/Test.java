import java.net.*;
import java.util.*;
import org.jsoup.*;

public class Test {

	public static void main(String[] args) {
		JPDataScrapper ds;
		JobPostingJSONWriter jpwjson;
		JobPostingCSVWriter jpwcsv;
		try {
			ds = new JPDataScrapper(new URL("https://opendata.citywindsor.ca/api/jobpostings/ets"));
			
			ds.scrapeData();
			
			jpwjson = new JobPostingJSONWriter("jobposting",ds.getJobPostings());
			jpwcsv = new JobPostingCSVWriter("jobposting",ds.getJobPostings());
			
			jpwjson.parseJobPostings();
			jpwcsv.parseJobPostings();
			jpwjson.writeJSON();
			jpwcsv.writeCSV();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
