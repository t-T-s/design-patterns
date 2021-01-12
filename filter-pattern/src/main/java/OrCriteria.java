import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author : Thulitha
 * date    : 23 - Oct - 2019
 * time    : 8:05 PM
 */
public class OrCriteria implements Criteria
{
	private Criteria criteria;
	private Criteria otherCriteria;

	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

//		for (Person person : otherCriteriaItems) {
//			if(!firstCriteriaItems.contains(person)){
//				firstCriteriaItems.add(person);
//			}
//		}

		HashSet<Person> finalSet = new HashSet<Person>( firstCriteriaItems );
		finalSet.addAll( otherCriteriaItems );

		return new ArrayList<Person>( finalSet );
	}
}
