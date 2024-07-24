//24/07/24
// Your challenge is to find the object that is “most popular,”
// i.e., the one that has the most reference variables refer-
// ring to it. Then list how many total references there are
// for that object, and what they are! We’ll start by pointing
// out one of the new objects and its reference variable.
// Good luck!

class Bees {
    Honey[] beeHoney;
}
class Raccoon {
    Kit rk;
    Honey rh;
}
class Kit {
    Honey honey;
}
class Bear {
    Honey hunny;
}
public class Honey {
    public static void main(String[] args) {
        //HoneyPot - 1
        Honey honeyPot = new Honey();

        //HoneyPot - 1 + 4
        Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot};

        //Bees - 1
        Bees bees = new Bees();

        //This do not adds to the reference 
        bees.beeHoney = ha;

        Bear[] bears = new Bear[5];

        for (int i = 0; i < 5; i++) {
            //Bears - 5
            bears[i] = new Bear();

            //HoneyPot 5 + 5
            bears[i].hunny = honeyPot;
        }

        //Kit - 1
        Kit kit = new Kit();

        //HoneyPot 10 + 1
        kit.honey = honeyPot;

        //Raccoon - 1
        Raccoon raccoon = new Raccoon();

        //HoneyPot 11 + 1
        raccoon.rh = honeyPot;

        //HoneyPot 12 + 1
        raccoon.rk = kit;

        //HoneyPot 13 - 1 = 12
        kit = null;
    } // end of main
}