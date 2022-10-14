import java.util.Comparator;

class SectorPayOrder implements Comparator<Person>
{
    public int compare(Person p1, Person p2)
    {
        if (p1.getSector().equals(p2.getSector()))
            return 0;
        else
            return p1.getSector().compareTo(p2.getSector());
    }
    
}