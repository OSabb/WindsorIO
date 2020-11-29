import java.net.URL;

public class TestJPCSVWriter {

	public static void main(String[] args) {
		JPDataScrapper ds;
		JobPostingCSVWriter jpwcsv;
		
		try {
			ds = new JPDataScrapper(new URL("https://opendata.citywindsor.ca/api/jobpostings/ets"));
			
			ds.scrapeData();
			
			jpwcsv = new JobPostingCSVWriter("jobposting",ds.getJobPostings());
			
			jpwcsv.parseJobPostings();
			jpwcsv.writeCSV();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
