/**
 * Created by David Turk on 7/24/17.
 */
public abstract class Soldier implements Comparable<Soldier>{
    String name;
    int rank;
    int serviceNumber;

    public abstract String takeOrder(String order, Soldier giver);
    protected abstract String sleep();
    protected  abstract String eat();
    protected abstract String march();
    protected  abstract String speak();

    public abstract int getRank();

    @Override
    public int compareTo(Soldier o) {
        return this.getRank() > o.getRank() ? 1 : this.getRank() < o.getRank() ? -1 : 0;
    }
}
