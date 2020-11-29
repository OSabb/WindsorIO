import java.net.URL;

public class TestJPJSONWriter {

	public static void main(String[] args) {
		JPDataScrapper ds;
		JobPostingJSONWriter jpwjson;
		
		try {
			ds = new JPDataScrapper(new URL("https://opendata.citywindsor.ca/api/jobpostings/ets"));
			
			ds.scrapeData();
			
			jpwjson = new JobPostingJSONWriter("jobposting",ds.getJobPostings());
			
			jpwjson.parseJobPostings();
			jpwjson.writeJSON();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
