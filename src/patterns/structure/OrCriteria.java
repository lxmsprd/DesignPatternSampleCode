package patterns.structure;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        List<Person> otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        for (Person p: otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(p)) {
                firstCriteriaPersons.add(p);
            }
        }
        return firstCriteriaPersons;
    }
}
