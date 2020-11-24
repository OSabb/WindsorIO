/* JobPosting Class
 * Description: Records a 'job posting' for storage
 * Author: Darius Zhou
 * Latest Update: November 23, 2020
 * Version: v1.0
*/

public class JobPosting {
	//attributes
	private String title;
	private String category;
	private String contact;
	private String description;
	private String link;
	
	//overloaded constructors
	public JobPosting(String t, String cg, String ct, String d, String l) {
		setTitle(t);
		setCategory(cg);
		setContact(ct);
		setDescription(d);
		setLink(l);
	}
	
	//access methods
	// Sets the title; no invalid option
	public String setTitle(String t) {
		title = t;
		return title;
	}
	
	// Gets the title
	public String getTitle() {
		return title;
	}
	
	// Sets the category; no invalid option
	public String setCategory(String c) {
		category = c;
		return category;
	}
	
	// Gets the category
	public String getCategory() {
		return category;
	}
	
	// Sets the contact; no invalid option
	public String setContact(String c) {
		contact = c;
		return contact;
	}
	
	// Gets the contact
	public String getContact() {
		return contact;
	}
	
	// Sets the description; no invalid option
	public String setDescription(String d) {
		description = d;
		return description;
	}
	
	// Gets the description
	public String getDescription() {
		return description;
	}
	
	// Sets the link; no invalid option
	public String setLink(String l) {
		link = l;
		return link;
	}
	
	// Gets the link
	public String getLink() {
		return link;
	}
	
	//Overriding toString() method
	public String toString() {
		return title + ", " + category + ", " + contact + ", " + description + ", " + link;
	}
}
