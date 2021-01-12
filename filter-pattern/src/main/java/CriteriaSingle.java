import java.util.ArrayList;
import java.util.List;

/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:04 PM
 */
public class CriteriaSingle implements Criteria
{
	public List<Person> meetCriteria( List<Person> persons )
	{
		List<Person> singlePersons = new ArrayList<Person>();

		for ( Person person : persons )
		{
			if ( person.getMaritalStatus().equalsIgnoreCase( "SINGLE" ) )
			{
				singlePersons.add( person );
			}
		}
		return singlePersons;

	}
}
