import java.net.URL;
import java.util.*;

public class TestJPDataScrapper {

	public static void main(String[] args) {
		JPDataScrapper ds;
		ArrayList<JobPosting> list;
		
		try {
			ds = new JPDataScrapper(new URL("https://opendata.citywindsor.ca/api/jobpostings/ets"));
			
			list = ds.scrapeData();
			
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Title: " + list.get(i).getTitle() + "\n");
				System.out.println("Category: " + list.get(i).getCategory() + "\n");
				System.out.println("Contact: " + list.get(i).getContact() + "\n");
				System.out.println("Description: " + list.get(i).getDescription() + "\n");
				System.out.println("Link: " + list.get(i).getLink() + "\n\n");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
