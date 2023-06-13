import java.util.Comparator;

public class SkedNameComparator implements Comparator<Sked> {

  @Override
  public int compare(Sked o1, Sked o2) {
    String name1 = o1.getName().toLowerCase();
    String name2 = o2.getName().toLowerCase();
    if (!name1.equals(name2)) {
      return name1.compareTo(name2);
    }
    return Integer.compare(o1.getTime(), o2.getTime());
  }

}
