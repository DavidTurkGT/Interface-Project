/**
 * Created by David Turk on 7/24/17.
 */
public interface Rifleman {
    String shoot();
    String reload();
    String identifyRifle();
    default String sayBranch(){
        return "Army!";
    }
}
