import java.util.Comparator;

public class RepkaMemebersComparator implements Comparator<RepkaPuller> {

    @Override
    public int compare(RepkaPuller o1, RepkaPuller o2) {
        return o1.getOrder() - o2.getOrder();
    }
}
