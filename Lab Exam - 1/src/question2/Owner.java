package question2;

public class Owner {
	private String name;
	private Date dateOfBirth;
	private String nic;

	public Owner() {
	}

	public Owner(String name, String nic, Date dateOfBirth) {
		this.name = name;
		this.nic = nic;
		this.dateOfBirth = dateOfBirth;
	}

	public Owner(Owner owner) {
		this(owner.name, owner.nic, owner.dateOfBirth);
	}

	public void input() {

	}

	public void print() {

	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
	}
}
