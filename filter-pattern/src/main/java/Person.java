/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:01 PM
 */
public class Person
{
	private String name;
	private String gender;
	private String maritalStatus;

	public Person(String name, String gender, String maritalStatus){
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
}
