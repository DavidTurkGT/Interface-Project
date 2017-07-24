/**
 * Created by David Turk on 7/24/17.
 */
public class Marine extends Soldier implements Rifleman {

    static String[] ranks = {"pvt","pfc","lcpl","cpl","sgt","ssgt","gysgt","msgt","1sgt","mgysgt","sgtmaj","2lt",
            "1lt","capt","maj","ltcol","col","bgen","majgen","ltgen","gen"};

    public Marine(String name, String rank, int serviceNumber) {
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.rank = 0;
        for(int i = 0; i < ranks.length; i++){
            if(rank.toLowerCase().equals(ranks[i])){
                this.rank = i;
            }
        }
    }

    public int getRank(){
        return this.rank;
    }

    @Override
    public String shoot() {
        return "Bang!";
    }


    @Override
    public String reload() {
        return "Reloading!";
    }

    @Override
    public String identifyRifle() {
        return "This is my rifle. There are many like it, but this one is mine.\n" +
                "My rifle is my best friend. It is my life. I must master it as I must master my life.\n" +
                "Without me, my rifle is useless. Without my rifle, I am useless. I must fire my rifle true. I must shoot straighter than my enemy who is trying to kill me. I must shoot him before he shoots me. I will…\n" +
                "My rifle and I know that what counts in war is not the rounds we fire, the noise of our burst, nor the smoke we make. We know that it is the hits that count. We will hit…\n" +
                "My rifle is human, even as I, because it is my life. Thus, I will learn it as a brother. I will learn its weaknesses, its strength, its parts, its accessories, its sights and its barrel. I will keep my rifle clean and ready, even as I am clean and ready. We will become part of each other. We will…\n" +
                "Before God, I swear this creed. My rifle and I are the defenders of my country. We are the masters of our enemy. We are the saviors of my life.\n" +
                "So be it, until victory is America's and there is no enemy, but peace!";
    }

    @Override
    public String takeOrder(String order, Soldier giver) {
        order = order.toLowerCase();
        if(this.compareTo(giver) > 0){
            return "I don't have to listen to you!";
        }
        else{
            switch(order){
                case "reload":
                    return reload();
                case "identifyrifle":
                    return identifyRifle();
                case "sleep":
                    return sleep();
                case "eat":
                    return eat();
                case "march":
                    return march();
                case "speak":
                    return speak();
                default:
                    return "I don't know what you mean";
            }
        }
    }

    @Override
    protected String sleep() {
        return "Zzzzzz";
    }

    @Override
    protected String eat() {
        return "I love MRE's!";
    }

    @Override
    protected String march() {
        return "Time to hump it over that hill there, Cap";
    }

    @Override
    protected String speak() {
        return "Oorah!";
    }

    @Override
    public String sayBranch() {
        return "Marines!";
    }
}
