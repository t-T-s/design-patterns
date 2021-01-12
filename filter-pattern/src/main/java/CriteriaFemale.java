import java.util.ArrayList;
import java.util.List;

/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:03 PM
 */
public class CriteriaFemale implements Criteria
{

	public List<Person> meetCriteria( List<Person> persons )
	{
		List<Person> femalePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")){
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
