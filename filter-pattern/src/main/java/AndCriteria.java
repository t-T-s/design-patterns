import java.util.List;

/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:05 PM
 */
public class AndCriteria implements Criteria
{
	private Criteria criteria;
	private Criteria otherCriteria;

	public AndCriteria( Criteria criteria, Criteria otherCriteria )
	{
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria( List<Person> persons )
	{

		List<Person> firstCriteriaPersons = criteria.meetCriteria( persons );
		return otherCriteria.meetCriteria( firstCriteriaPersons );
	}
}
