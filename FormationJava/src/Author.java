
public class Author {
	private String firstname;
	private String lastname;
	
	public void afficher(){
		System.out.println(" First name : " + firstname);
		System.out.println(" Last name : " + lastname);
		}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
