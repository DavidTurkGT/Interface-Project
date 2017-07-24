/**
 * Created by David Turk on 7/24/17.
 */
public class FalloutSuit extends Soldier implements NukeSuit {

    private String[] ranks = {"tiny","big","boomboom","moab","nuclear", "fallout"};
    private Bomb ammo;


    @Override
    public Bomb getBomb() {
        return ammo;
    }

    public FalloutSuit(String name, String rank, int serviceNumber, Bomb ammo) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.ammo = ammo;
        this.rank = 0;
        for(int i = 0; i < ranks.length; i++){
            if(rank.toLowerCase().equals(ranks[i])){
                this.rank = i;
            }
        }
    }

    @Override
    public String takeOrder(String order, Soldier giver) {
        if(this.compareTo(giver) > 0){
            return "I don't take orders from you!";
        } else{
            switch(order.toLowerCase()){
                case "pullpin":
                    return pullPin();
                case "throwgranade":
                    return throwGrenade();
                case "sleep":
                    return sleep();
                case "eat":
                    return eat();
                case "march":
                    return march();
                case "speak":
                    return speak();
                default:
                    return "I'm not sure what you mean";
            }
        }
    }

    @Override
    public String pullPin() {
        return "Better throw it soon!";
    }

    @Override
    public String throwGrenade() {
        return "Bombs away!";
    }

    @Override
    protected String sleep() {
        return "Zzzzzzz";
    }

    @Override
    protected String eat() {
        return "I love napalm in the morning!";
    }

    @Override
    protected String march() {
        return "I will walk";
    }

    @Override
    protected String speak() {
        return "Time to blow sh*t up!";
    }

    @Override
    public int getRank() {
        return rank;
    }
}
