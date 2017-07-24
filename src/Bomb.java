/**
 * Created by David Turk on 7/24/17.
 */
public class Bomb {
    private int size;

    public Bomb(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "This is a bomb of size: " + this.size;
    }
}
