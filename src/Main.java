/**
 * Created by David Turk on 7/24/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Marine Testing....");
        Marine privateFirstClass = new Marine("Bill","pfc",1234);
        Marine sarg = new Marine("Tom","sgt",876);

        System.out.println("Bill gives Tom an order");
        System.out.println(sarg.takeOrder("eat",privateFirstClass));

        System.out.println("Tom gives orders");
        System.out.println(privateFirstClass.takeOrder("eat",sarg));

        System.out.println("Testing other orders directly to save typing");
        System.out.println("Sleep: " + sarg.sleep());
        System.out.println("ID Rifle: " + sarg.identifyRifle());
        System.out.println("March: " + sarg.march());
        System.out.println("Reload: " + sarg.reload());
        System.out.println("Shoot: " + sarg.shoot());
        System.out.println("Say branch: " + sarg.sayBranch());
        System.out.println("---------------------------------------");
        System.out.println("Grenadier testing...");
        BoomMan wimp = new BoomMan("Wimp","tiny",487235);
        BoomMan fatMan = new BoomMan("FatMan","nuclear",928349023);

        System.out.println("wimp gives fatman an order");
        System.out.println(fatMan.takeOrder("eat",wimp));
        System.out.println("fatman gives wimp an order");
        System.out.println(wimp.takeOrder("eat",fatMan));

        System.out.println("Testing other methods");
        System.out.println("March: " + wimp.march());
        System.out.println("Pull Pin: " + wimp.pullPin());
        System.out.println("Sleep: " + wimp.sleep());
        System.out.println("Speak: " + wimp.speak());
        System.out.println("Throw Grenade: " + wimp.throwGrenade());
        System.out.println("-----------------------------------------");

        System.out.println("Testing extending interface");
        FalloutSuit nick = new FalloutSuit("nick","fallout",111,new Bomb(1400) );
        System.out.println("March: " + nick.march());
        System.out.println("Pull Pin: " + nick.pullPin());
        System.out.println("Sleep: " + nick.sleep());
        System.out.println("Speak: " + nick.speak());
        System.out.println("Throw Grenade: " + nick.throwGrenade());
        System.out.println("Bomb: " + nick.getBomb());
        System.out.println("-----------------------------------------");

    }
}
